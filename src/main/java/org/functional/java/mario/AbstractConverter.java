package org.functional.java.mario;

/**
 *  * @author Ramachandran Murugaian on 14-11-2016 16:15.
 *  
 */
public abstract class AbstractConverter implements Converter {

    @Override
    public double convert(final Double aDouble) {
        return aDouble * getConversionRate();
    }

    public abstract double getConversionRate();
}
