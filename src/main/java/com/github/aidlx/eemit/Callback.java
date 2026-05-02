package com.github.aidlx.eemit;

@FunctionalInterface
public interface Callback<T> {
    void call(String channel, T object);
}
