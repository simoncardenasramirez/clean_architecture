package com.priv.co.practice.crosscutting.exceptions;


import com.priv.co.practice.crosscutting.enums.Layer;


public final class DataPracticeException extends PracticeException {

    private static final long serialVersionUID = 1L;

    public DataPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.DATA, rootException);
    }

    public static final DataPracticeException create(final String technicalMessage,final  String userMessage,
                                                   final Exception rootException) {

        return new DataPracticeException(technicalMessage, userMessage, rootException);

    }

    public static final DataPracticeException create(final  String userMessage,
                                                   final Exception rootException) {

        return new DataPracticeException(userMessage, userMessage, rootException);

    }

    public static final DataPracticeException create(final String technicalMessage,final  String userMessage) {

        return new DataPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final DataPracticeException create(final  String userMessage) {

        return new DataPracticeException(userMessage,userMessage, new Exception());

    }

}
