package com.priv.co.practice.crosscutting.exceptions;

import com.priv.co.practice.crosscutting.enums.Layer;

public final class ControllerPracticeException extends PracticeException {

    private static final long serialVersionUID = 1L;

    public ControllerPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.CONTROLLER, rootException);
    }

    public static final ControllerPracticeException create(final String technicalMessage,final  String userMessage,
                                                         final Exception rootException) {

        return new ControllerPracticeException(technicalMessage, userMessage, rootException);

    }

    public static final ControllerPracticeException create(final  String userMessage,
                                                         final Exception rootException) {

        return new ControllerPracticeException(userMessage, userMessage, rootException);

    }

    public static final ControllerPracticeException create(final String technicalMessage,final  String userMessage) {

        return new ControllerPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final ControllerPracticeException create(final  String userMessage) {

        return new ControllerPracticeException(userMessage,userMessage, new Exception());

    }

}
