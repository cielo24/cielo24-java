package cielo24.utils.gson;

import java.lang.reflect.Type;

import cielo24.utils.Guid;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class GuidSerializer implements JsonSerializer<Guid> {

    @Override
    public JsonElement serialize(Guid guid, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(guid.toString());
    }
}