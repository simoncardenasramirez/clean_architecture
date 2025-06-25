package com.priv.co.practice.crosscutting.exceptions;


import com.priv.co.practice.crosscutting.enums.Layer;

public final class DtoPracticeException extends PracticeException {

    private static final long serialVersionUID = 1L;

    public DtoPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.DTO, rootException);
    }

    public static final DtoPracticeException create(final String technicalMessage,final  String userMessage,
                                                  final Exception rootException) {

        return new DtoPracticeException(technicalMessage, userMessage, rootException);

    }

    public static final DtoPracticeException create(final  String userMessage,
                                                  final Exception rootException) {

        return new DtoPracticeException(userMessage, userMessage, rootException);

    }

    public static final DtoPracticeException create(final String technicalMessage,final  String userMessage) {

        return new DtoPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final DtoPracticeException create(final  String userMessage) {

        return new DtoPracticeException(userMessage,userMessage, new Exception());

    }

}

