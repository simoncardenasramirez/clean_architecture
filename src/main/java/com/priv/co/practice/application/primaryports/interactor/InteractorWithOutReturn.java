package com.priv.co.practice.application.primaryports.interactor;

public interface InteractorWithOutReturn<T> {

    void execute(T data);
}
