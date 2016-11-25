package org.functional.java.mario

import spock.lang.Specification

/**
  * @author Ramachandran Murugaian on 14-11-2016 16:21.
  */
class ConverterSpec extends Specification {

    private AllConverter allConverter;

    def setup() {
        allConverter = new AllConverter()
    }

    def "Mi2KmConvertor"() {
        given:
        final Converter converter = new Mi2KmConvertor();
        final List<Double> values = [10D, 20D, 30D];

        when:
        def result = allConverter.convertValues(values, converter)

        then:
        result.size() == 3
        result[0] == 16.09
        result[1] == 32.18
        result[2] == 48.269999999999996
    }
}
