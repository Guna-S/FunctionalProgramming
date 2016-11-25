package org.functional.java;

import java.util.function.Function;

/**
 *  @author Ramachandran Murugaian on 11-11-2016 17:14.
 *  
 */
public class PureAndHighOrderFunction {

    static Function<Integer, Integer> add10() {
        return value -> value + 10;
    }

    static Function<Integer, Integer> mult5() {
        return value -> value * 5;
    }

    static Function<Function<Integer, Integer>, Function<Integer, Integer>> andThenMult5() {
        return previousFunction -> previousFunction.andThen(mult5());
    }

    public static void main(final String[] args) {
        Util.print().accept(andThenMult5().apply(add10()).apply(5));
    }
}
