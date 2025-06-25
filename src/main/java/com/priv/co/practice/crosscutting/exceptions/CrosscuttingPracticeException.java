package com.priv.co.practice.crosscutting.exceptions;

import com.priv.co.practice.crosscutting.enums.Layer;

public final class CrosscuttingPracticeException extends PracticeException {


    private static final long serialVersionUID = 1L;

    public CrosscuttingPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.CROSSCUTTING, rootException);
    }


    public static  CrosscuttingPracticeException create(final String technicalMessage,final  String userMessage,
                                                     final Exception rootException) {

        return new CrosscuttingPracticeException(technicalMessage, userMessage, rootException);

    }

    public static  CrosscuttingPracticeException create(final  String userMessage,
                                                     final Exception rootException) {

        return new CrosscuttingPracticeException(userMessage, userMessage, rootException);

    }

    public static  CrosscuttingPracticeException create(final String technicalMessage,final  String userMessage) {

        return new CrosscuttingPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static  CrosscuttingPracticeException create(final  String userMessage) {

        return new CrosscuttingPracticeException(userMessage,userMessage, new Exception());

    }
}
