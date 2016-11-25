package org.functional.java.mario;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *  * @author Ramachandran Murugaian on 14-11-2016 17:37.
 *  
 */
@FunctionalInterface
public interface ConverterFunctional extends BiFunction<Double, Double, Double> {


    default Function<Double, Double> curryLeft(final Double firstValue) {
        return secondValue -> apply(firstValue, secondValue);
    }

    default Function<Double, Double> currySecond(final Double secondValue) {
        return firstValue -> apply(firstValue, secondValue);
    }
}
