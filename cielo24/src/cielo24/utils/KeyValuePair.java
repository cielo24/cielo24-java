package cielo24.utils;

import java.util.AbstractMap;

@SuppressWarnings("serial")
public class KeyValuePair<K, V> extends AbstractMap.SimpleEntry<K, V>{

    public KeyValuePair(K k, V v) {
        super(k, v);
    }
}