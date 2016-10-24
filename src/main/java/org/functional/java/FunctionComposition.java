package org.functional.java;

import java.util.function.Function;

/**
 *  @author Ramachandran Murugaian on 20-10-2016 14:57.
 *  
 */
@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class FunctionComposition {

    static Function<Integer, Integer> add10() {
        return (value) -> 10 + value;
    }

    static Function<Integer, Integer> mult5() {
        return (value) -> 5 * value;
    }

    static Function<Integer, Integer> add10Mult5() {
        return (value) -> 5 * (value + 10);
    }


    public static void main(final String[] args) {
        final Integer plus10 = add10().apply(10);
        final Integer mult5 = mult5().apply(10);
        final Integer add10Mul5 = add10Mult5().apply(10);
        final Integer compose = add10().andThen(mult5()).apply(10);
        Util.print().accept(plus10);
        Util.print().accept(mult5);
        Util.print().accept(add10Mul5);
        Util.print().accept(compose);
    }
}
