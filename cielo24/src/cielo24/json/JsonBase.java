package cielo24.json;

import cielo24.Utils;

import com.google.gson.Gson;

public abstract class JsonBase {

    @Override
    public String toString() {
        Gson g = Utils.getCustomGson();
        return g.toJson(this);
    }
}