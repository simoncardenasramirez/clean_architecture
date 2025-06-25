package com.priv.co.practice.application.usecase;

public interface UseCaseWithOutReturn<D> {
	
	void execute (D data);

}
