package com.priv.co.practice.crosscutting.exceptions;


import com.priv.co.practice.crosscutting.enums.Layer;

public final class UseCasePracticeException extends PracticeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UseCasePracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.USERCASE, rootException);
        // TODO Auto-generated constructor stub
    }

    public static final UseCasePracticeException create(final String technicalMessage,final  String userMessage,
                                                      final Exception rootException) {

        return new UseCasePracticeException(technicalMessage, userMessage, rootException);

    }

    public static final UseCasePracticeException create(final  String userMessage,
                                                      final Exception rootException) {

        return new UseCasePracticeException(userMessage, userMessage, rootException);

    }

    public static final UseCasePracticeException create(final String technicalMessage,final  String userMessage) {

        return new UseCasePracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final UseCasePracticeException create(final  String userMessage) {

        return new UseCasePracticeException(userMessage,userMessage, new Exception());

    }

}
