package org.functional.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *  * @author Ramachandran Murugaian on 24-10-2016 12:45.
 *  
 */
public class FunctionalMap {

    static List<Integer> map(final Function<Integer, Integer> userFunc, final Integer[] array) {
        return Arrays.stream(array).map(userFunc).collect(Collectors.toList());
    }
}
