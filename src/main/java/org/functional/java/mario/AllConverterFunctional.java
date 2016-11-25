package org.functional.java.mario;

import org.functional.java.Util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  * @author Ramachandran Murugaian on 14-11-2016 17:40.
 *  
 */
public class AllConverterFunctional implements ConverterFunctional {

    public static void main(final String[] args) {
        final List<Double> values = Arrays.asList(10.0, 20.0, 30.0);
        final AllConverterFunctional allConverterFunctional = new AllConverterFunctional();
        final Function<Double, Double> mi2KmConverter = allConverterFunctional.curryLeft(1.609);
        final Function<Double, Double> ou2GrConverter = allConverterFunctional.curryLeft(28.345);
        final List<Double> collect =
            Stream
                .of(10.0, 20.0, 30.0)
                .map(mi2KmConverter)
                .collect(Collectors.toList());
        Util.print().accept(collect);

    }

    @Override
    public Double apply(final Double aDouble, final Double aDouble2) {
        return aDouble * aDouble2;
    }
}
