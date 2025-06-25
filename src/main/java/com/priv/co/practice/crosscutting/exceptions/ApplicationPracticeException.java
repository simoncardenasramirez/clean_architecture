package com.priv.co.practice.crosscutting.exceptions;


import com.priv.co.practice.crosscutting.enums.Layer;

public final class ApplicationPracticeException extends PracticeException {

    private static final long serialVersionUID = 1L;

    public ApplicationPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.APPLICATION, rootException);
    }

    public static final ApplicationPracticeException create(final String technicalMessage,final  String userMessage,
                                                          final Exception rootException) {

        return new ApplicationPracticeException(technicalMessage, userMessage, rootException);

    }

    public static final ApplicationPracticeException create(final  String userMessage,
                                                          final Exception rootException) {

        return new ApplicationPracticeException(userMessage, userMessage, rootException);

    }

    public static final ApplicationPracticeException create(final String technicalMessage,final  String userMessage) {

        return new ApplicationPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final ApplicationPracticeException create(final  String userMessage) {

        return new ApplicationPracticeException(userMessage,userMessage, new Exception());

    }





}
