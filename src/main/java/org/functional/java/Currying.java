package org.functional.java;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * We can make use point Freer notation concept when we have functions which accepts
 * one parameter as their argument.
 * <p>
 * Let's say if a function has two parameters or more than two,
 * we can't make that function as point free notation function.
 * <p>
 * Well, what would be really great is if we had some way of giving our add function
 * only one of its parameters ahead of time and then
 * it would get its second parameter later when mult5AfterAdd10 is called.
 * <p>
 * Here is the situation where we need Currying.
 *
 * @author Ramachandran Murugaian on 21-10-2016 11:55.
 * @see PointFreeNotation#add10Mult5()  
 */
public class Currying {

    /**
     * Function which accepts two argument and add them.
     *
     * @return java.util.function.BiFunction which accepts two argument
     */
    static BiFunction<Integer, Integer, Integer> add() {
        return (x, y) -> x + y;
    }

    /**
     * @return
     */
    static Function<Integer, Function<Integer, Integer>> add2() {
        return x -> y -> x + y;
    }

    /**
     * This method will curry the constant value from the inputs for
     * {@link Currying#add()} method.
     *
     * @param x
     * @return java.util.function.Function
     */
    static Function<Integer, Integer> curryLeft(final Integer x) {
        return y -> add().apply(x, y);
    }

    /**
     * @return
     */
    static Function<Integer, Integer> mult5AfterAdd10() {
        //final Function<Integer, Integer> add10 = Currying.curryLeft(10);
        final Function<Integer, Integer> add10 = add2().apply(10);
        return add10.andThen(FunctionComposition.mult5());
    }

    public static void main(final String[] args) {
        Util.print().accept(mult5AfterAdd10().apply(10));
    }
}
