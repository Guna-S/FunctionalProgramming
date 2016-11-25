package org.functional.java.mario;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  * @author Ramachandran Murugaian on 14-11-2016 16:22.
 *  
 */
public class AllConverter {

    public static List<Double> convertValues(final List<Double> values, final Converter converter) {
        return
            values
                .stream()
                .map(converter::convert)
                .collect(Collectors.toList());
    }
}
