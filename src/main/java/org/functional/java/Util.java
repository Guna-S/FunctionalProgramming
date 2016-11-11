package org.functional.java;

import java.util.function.Consumer;

/**
 *  * @author Ramachandran Murugaian on 21-10-2016 11:56.
 *  
 */
@SuppressWarnings({"UseOfSystemOutOrSystemErr", "ClassNamingConvention"})
public class Util {
    public static <T> Consumer<T> print() {
        return t -> System.out.println("Value ::: " + t);
    }
}
