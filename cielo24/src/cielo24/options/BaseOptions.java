package cielo24.options;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.MoreObjects;

import cielo24.Utils;
import cielo24.utils.KeyValuePair;
import cielo24.utils.QueryName;

/* The base class. All of the other option classes inherit from it. */
public abstract class BaseOptions {

    /*
     * Returns a hashtable that contains key-value pairs of options, where key
     * is the Name property of the QueryName attribute assigned to every option
     * and value is the value of the property. Options with null value are not
     * included in the hashtable.
     */
    public Hashtable<String, Object> getHashtable() {
        Hashtable<String, Object> queryHashtable = new Hashtable<String, Object>();
        Field[] fields = this.getClass().getFields();
        for (Field field : fields) {
            Object value;
            try {
                value = field.get(this);
            } catch (IllegalAccessException e) {
                // Catch IllegalAccessException and throw RuntimeException.
                // Try block will NEVER fail here, because of the way Option classes are structured.
                // So there is no need to enforce checked exceptions.
                throw new RuntimeException("Unable to obtain field value.", e);
            }
            if (value != null) { // If field is null, don't include the key-value pair in the hashtable
                QueryName key = field.getDeclaredAnnotation(QueryName.class);
                queryHashtable.put(key.value(), value);
            }
        }
        return queryHashtable;
    }

    public Hashtable<String, String> getStringHashtable() {
        Hashtable<String, Object> objHashtable = this.getHashtable();
        Hashtable<String, String> queryHashtable = new Hashtable<String, String>();
        for (String key : objHashtable.keySet()) {
            queryHashtable.put(key, this.getStringValue(objHashtable.get(key)));
        }
        return queryHashtable;
    }

    /* Returns a query String representation of options */
    public String toQuery() {
        Hashtable<String, String> queryHashtable = this.getStringHashtable();
        return Utils.toQuery(queryHashtable);
    }

    /* Sets the property whose QueryName attribute matches the key */
    public void populateFromKeyValuePair(KeyValuePair<String, String> pair) {
        Field[] fields = this.getClass().getFields();
        for (Field field : fields) {
            QueryName key = field.getDeclaredAnnotation(QueryName.class);
            Type type = field.getType();
            if (key.value().equals(pair.getKey())) {
                try {
                    field.set(this, this.getValueFromString(pair.getValue(), type));
                } catch (IllegalAccessException e) {
                    // Catch IllegalAccessException and throw RuntimeException.
                    // Try block will NEVER fail here, because of the way Option classes are structured.
                    // So there is no need to enforce checked exceptions.
                    throw new RuntimeException("Unable to set field to given value.", e);
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid option: " + pair.getKey()); // Fail if property not found
    }

    // Array of Strings in the key=value form
    public void populateFromArray(String[] array) {
        for (String s : MoreObjects.firstNonNull(array, new String[0])) {
            Matcher regex = Pattern.compile("([^?=&]+)(=([^&]*))?").matcher(s);
            if (regex.matches()) {
                this.populateFromKeyValuePair(new KeyValuePair<String, String>(regex.group(1), regex.group(3)));
            }
        }
    }

    /* Converts String into an object */
    protected Object getValueFromString(String str, Type type) {
        // Quotes are necessary in json
        return Utils.deserialize(str, type);
    }

    /* Converts 'value' into String based on its type. Precondition: value != null */
    protected String getStringValue(Object value) {
        if (value instanceof ArrayList<?>) {
            // ArrayLists can contain strings and enums, type does not matter
            return Utils.getCustomGson().toJson(value);
        } else if (value instanceof char[]) {                // char[] (returned as (a, b))
            return Utils.getCustomGson().toJson(value);
        } else {                                             // Takes care of the rest: Integer, Boolean, String, URL, LocalDateTime
            return value.toString();
        }
    }
}