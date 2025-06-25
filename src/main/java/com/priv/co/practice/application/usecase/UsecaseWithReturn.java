package com.priv.co.practice.application.usecase;

public interface UsecaseWithReturn<R,D> {

	R execute(D data);
}
