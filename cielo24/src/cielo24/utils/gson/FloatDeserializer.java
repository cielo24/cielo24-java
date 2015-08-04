package cielo24.utils.gson;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

// Deserializes empty string to null
public class FloatDeserializer implements JsonDeserializer<Float> {

    @Override
    public Float deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        if (json.getAsString().equals("")) {
            return null;
        }
        return Float.parseFloat(json.getAsString());
    }
}