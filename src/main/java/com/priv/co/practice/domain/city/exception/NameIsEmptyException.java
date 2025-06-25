package com.priv.co.practice.domain.city.exception;

import com.priv.co.practice.crosscutting.exceptions.RulePracticeException;

public class NameIsEmptyException extends RulePracticeException {

    private static final long serialVersionUID = 1L;



    public NameIsEmptyException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }


    public static final NameIsEmptyException create(String technicalMessage, String userMessage, Exception rootException) {
        return new NameIsEmptyException(userMessage, userMessage, new Exception());

    }

}
