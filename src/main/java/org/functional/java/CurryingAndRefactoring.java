package org.functional.java;

import javaslang.Function3;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  Parameter order is important to fully leverage currying.
 *
 * @author Ramachandran Murugaian on 21-10-2016 12:28.
 * @see Currying
 *  
 */
public class CurryingAndRefactoring {

    /**
     * This method will return a function which will accepts three strings and concatinate them
     * in the order which received.
     *
     * @return javaslang.Function3
     */
    static Function3<String, String, String, String> generalBracket() {
        return (prefix, value, suffix) ->
            Arrays.stream(new String[]{prefix, value, suffix})
                .collect(Collectors.joining());
    }

    /**
     * {@link CurryingAndRefactoring#curryValue(String)} is function which will curry
     * the original text value which will be appended.
     *
     * @param value
     * @return java.util.function.BiFunction which accepts prefix and suffix as their input parameters.
     */
    static BiFunction<String, String, String> curryValue(final String value) {
        return (prefix, suffix) -> generalBracket().apply(prefix, value, suffix);
    }

    /**
     * Point free notation method.
     * <p>
     * {@link CurryingAndRefactoring#bracket()} is a function waiting for their final parameter.
     *
     * @return
     */
    static Function<String, String> bracket() {
        return value -> curryValue(value).apply("{", "}");
    }

    /**
     * Point free notation method
     * <p>
     * {@link CurryingAndRefactoring#doubleBracket()} is a function waiting for their final Parameter.
     *
     * @return
     */
    static Function<String, String> doubleBracket() {
        return value -> curryValue(value).apply("{{", "}}");
    }

    /**
     * TODO MOVE TO Specification
     *
     * @param args
     */
    public static void main(final String[] args) {
        Util.print().accept(bracket().apply("Ram"));
        Util.print().accept(doubleBracket().apply("Ram"));
    }
}
