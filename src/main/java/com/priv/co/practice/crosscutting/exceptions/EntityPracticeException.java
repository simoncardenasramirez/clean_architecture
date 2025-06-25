package com.priv.co.practice.crosscutting.exceptions;

import com.priv.co.practice.crosscutting.enums.Layer;

public final class EntityPracticeException extends PracticeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public EntityPracticeException(final String technicalMessage,final  String userMessage, Exception rootException) {
        super(technicalMessage, userMessage, Layer.ENTITY, rootException);
    }

    public static final EntityPracticeException create(final String technicalMessage,final  String userMessage,
                                                     final Exception rootException) {

        return new EntityPracticeException(technicalMessage, userMessage, rootException);

    }

    public static final EntityPracticeException create(final  String userMessage,
                                                     final Exception rootException) {

        return new EntityPracticeException(userMessage, userMessage, rootException);

    }

    public static final EntityPracticeException create(final String technicalMessage,final  String userMessage) {

        return new EntityPracticeException(technicalMessage, userMessage, new Exception());

    }

    public static final EntityPracticeException create(final  String userMessage) {

        return new EntityPracticeException(userMessage,userMessage, new Exception());

    }

}
