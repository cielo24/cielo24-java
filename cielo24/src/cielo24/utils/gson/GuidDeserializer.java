package cielo24.utils.gson;

import java.lang.reflect.Type;

import cielo24.utils.Guid;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class GuidDeserializer implements JsonDeserializer<Guid> {

    @Override
    public Guid deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        return new Guid(json.getAsString());
    }
}