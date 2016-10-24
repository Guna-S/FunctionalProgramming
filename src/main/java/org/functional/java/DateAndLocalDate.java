package org.functional.java;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Function;

/**
 *  * @author Ramachandran Murugaian on 21-10-2016 13:12.
 *  
 */
public class DateAndLocalDate {
    static Function<String, Date> from() {
        return (date) ->
             Date.from(
                LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE)
                    .atStartOfDay().toInstant(ZoneOffset.UTC));
    }

    public static void main(final String[] args) {
        Util.print().accept(DateAndLocalDate.from().apply("2016-10-13"));
    }
}
