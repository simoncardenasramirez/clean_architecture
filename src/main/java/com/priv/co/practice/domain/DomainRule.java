package com.priv.co.practice.domain;

public interface DomainRule<T> {
    void execute(T data);
}
