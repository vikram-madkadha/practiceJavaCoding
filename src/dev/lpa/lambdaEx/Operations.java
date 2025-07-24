package dev.lpa.lambdaEx;

@FunctionalInterface
public interface Operations<T> {
    T operates(T value1, T value2);
}
