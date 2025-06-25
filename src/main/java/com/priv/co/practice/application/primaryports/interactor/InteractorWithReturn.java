package com.priv.co.practice.application.primaryports.interactor;

public interface InteractorWithReturn<T,R> {

    R execute(T data);

}
