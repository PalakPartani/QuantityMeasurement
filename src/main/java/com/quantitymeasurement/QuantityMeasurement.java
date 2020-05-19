/******************************************
 * purpose:Conversion of units
 * @author name:Palak
 * @version:1.0
 * @Date:18-05-2020
 *******************************************/
package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;
import com.quantitymeasurement.exception.UnitException;

public class QuantityMeasurement {

    /**
     * @param value    the value to get operated on
     * @param unitType the type of enum
     * @return converted value
     * @purpose:Convert one unit to another
     */
    public double getConvertedUnit(double value, Units unitType) {
        if (value < 0)
            throw new UnitException("Negative value not allowed", UnitException.ExceptionType.NEGATIVE_VALUE);
        if (unitType.equals(Units.CELCIUS))
            return value * unitType.unitType + 32;
        return value * unitType.unitType;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}