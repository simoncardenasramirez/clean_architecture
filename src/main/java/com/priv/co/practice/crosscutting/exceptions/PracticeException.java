package com.priv.co.practice.crosscutting.exceptions;

import com.priv.co.practice.crosscutting.enums.Layer;
import com.priv.co.practice.crosscutting.helpers.ObjectHelper;
import com.priv.co.practice.crosscutting.helpers.TextHelper;

public class PracticeException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private  String userMessage;
    private Layer layer;

    public PracticeException(String technicalMessage,
                           String userMessage,Layer layer,
                           Exception rootException) {

        super(ObjectHelper.getDefault(technicalMessage, TextHelper.applyTrim(userMessage)),ObjectHelper.getDefault(rootException, new Exception()));

        setLayer(layer);
        setUserMessage(userMessage);
    }

    public String getUserMessage() {
        return userMessage;
    }

    private final  void setUserMessage(String userMessage) {
        this.userMessage = TextHelper.applyTrim(userMessage);
    }

    public Layer getLayer() {
        return layer;
    }

    private final void setLayer(Layer layer) {
        this.layer = ObjectHelper.getDefault(layer, Layer.GENERAL);
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public static  PracticeException create(final String technicalMessage,final  String userMessage,
                                          final Exception rootException) {

        return new PracticeException(technicalMessage, userMessage, Layer.GENERAL, rootException);

    }

    public static  PracticeException create(final  String userMessage,
                                          final Exception rootException) {

        return new PracticeException(userMessage, userMessage, Layer.GENERAL, rootException);

    }

    public static  PracticeException create(final String technicalMessage,final  String userMessage) {

        return new PracticeException(technicalMessage, userMessage, Layer.GENERAL, new Exception());

    }

    public static PracticeException create(final  String userMessage) {

        return new PracticeException(userMessage,userMessage, Layer.GENERAL, new Exception());

    }



}

