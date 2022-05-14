package ru.ufa;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}