package com.priv.co.practice.crosscutting.exceptions;


import com.priv.co.practice.crosscutting.enums.Layer;

public class RulePracticeException extends PracticeException {

    private static final long serialVersionUID = 1L;

    public RulePracticeException(final String technicalMessage, final String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.RULE, rootException);
    }

    public static RulePracticeException create(final String technicalMessage, final String userMessage,
                                             final Exception rootException) {
        return new RulePracticeException(technicalMessage, userMessage, rootException);
    }

    public static RulePracticeException create(final String userMessage, final Exception rootException) {
        return new RulePracticeException(userMessage, userMessage, rootException);
    }

    public static RulePracticeException create(final String technicalMessage, final String userMessage) {
        return new RulePracticeException(technicalMessage, userMessage, new Exception());
    }

    public static RulePracticeException create(final String userMessage) {
        return new RulePracticeException(userMessage, userMessage, new Exception());
    }

}