package com.github.h2337.eemit;

@FunctionalInterface
public interface Callback<T> {
    void call(String channel, T object);
}
