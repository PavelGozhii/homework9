package com.company;

public interface Manageable<T> {
    String getKeyForMailService();

    T getValueForMailService();
}
