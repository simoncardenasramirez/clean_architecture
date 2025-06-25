package com.priv.co.practice.domain.city.exception;

import com.priv.co.practice.crosscutting.exceptions.RulePracticeException;

public class CityDoesNotExistException extends RulePracticeException {

    private static final long serialVersionUID = 1L;



    public CityDoesNotExistException(String technicalMessage, String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, rootException);
    }


    public static final CityDoesNotExistException create(String technicalMessage, String userMessage, Exception rootException) {
        return new CityDoesNotExistException(userMessage, userMessage, new Exception());

    }

}
