package com.priv.co.practice.crosscutting.helpers;


public class NumericHelper {

    private NumericHelper() {

    }

    public static final <T extends Number> boolean isGreat(final T numberOne, final T numberTwo) {
        return numberOne.doubleValue() > numberTwo.doubleValue();
    }

    public static final <T extends Number> boolean isLess(final T numberOne, final T numberTwo) {
        return numberOne.doubleValue() < numberTwo.doubleValue();
    }

    public static final <T extends Number> boolean isDifferent(final T numberOne, final T numberTwo) {
        return numberOne.doubleValue() != numberTwo.doubleValue();
    }

    public static final <T extends Number> boolean isEqual(final T numberOne, final T numberTwo) {
        return numberOne.doubleValue() == numberTwo.doubleValue();
    }

    public static final <T extends Number> boolean isGreatOrEqual(final T numberOne, final T numberTwo) {
        return numberOne.doubleValue() >= numberTwo.doubleValue();
    }

    public static final <T extends Number> boolean isLessOrEqual(final T numberOne, final T numberTwo) {
        return numberOne.doubleValue() <= numberTwo.doubleValue();
    }

    public static final <T extends Number> boolean isBetween(final T number, final T initialLimit, final T finalLimit,
                                                             final boolean includeInitialLimit, final boolean includeFinalLimit) {
        return (includeInitialLimit ? isGreatOrEqual(number, initialLimit) : isGreat(number, initialLimit))
                && (includeFinalLimit ? isLessOrEqual(number, finalLimit) : isLess(number, finalLimit));
    }

}

