package ru.ufa;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError();
}