package com.priv.co.practice.crosscutting.exceptions;


import com.priv.co.practice.crosscutting.enums.Layer;

public final class DomainPracticeException extends PracticeException {

    private static final long serialVersionUID = 1L;

    public DomainPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.DOMAIN, rootException);
    }

    public static final DomainPracticeException create(final String technicalMessage,final  String userMessage,
                                                     final Exception rootException) {

        return new DomainPracticeException(technicalMessage, userMessage, rootException);

    }

    public static final DomainPracticeException create(final  String userMessage,
                                                     final Exception rootException) {

        return new DomainPracticeException(userMessage, userMessage, rootException);

    }

    public static final DomainPracticeException create(final String technicalMessage,final  String userMessage) {

        return new DomainPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final DomainPracticeException create(final  String userMessage) {

        return new DomainPracticeException(userMessage,userMessage, new Exception());

    }

}
