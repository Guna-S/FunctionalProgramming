package org.functional.java;

import java.util.function.Function;

/**
 *  
 * <p>
 * First, we don’t have to specify redundant parameters.
 * And since we don’t have to specify them, we don’t have to think up names for all of them.
 * <p>
 * Second, it’s easier to read and reason about since it’s less verbose.
 * This example is simple, but imagine a function that took more parameters.
 *  
 *  @author Ramachandran Murugaian on 21-10-2016 12:05.
 *
 *  @see FunctionComposition#add10Mult5()
 *
 */
public class PointFreeNotation {

    static Function<Integer, Integer> add10() {
        return (value) -> 10 + value;
    }

    static Function<Integer, Integer> mult5() {
        return (value) -> 5 * value;
    }

    /**
     * Point Free notation method.
     * <p>
     * A function which expects one parameter.
     * But we don't need tp specify the parameter name anywhere.
     *
     * @return
     */
    static Function<Integer, Integer> add10Mult5() {
        return add10().andThen(mult5());
    }

    public static void main(final String[] args) {
        Util.print().accept(add10Mult5().apply(10));
    }
}
