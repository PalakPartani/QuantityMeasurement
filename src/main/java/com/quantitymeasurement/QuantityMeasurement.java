/******************************************
 * purpose:Conversion of units
 * @author name:Palak
 * @version:1.0
 * @Date:18-05-2020
 *******************************************/
package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;

public class QuantityMeasurement {
    double feet;
    double inch;

    /**
     * @param value    the value to get operated on
     * @param unitType the type of enum
     * @return converted value
     * @purpose:Convert one unit to another
     */
    public double getConvertedUnit(double value, Units unitType) {
        if (unitType.equals(Units.CELCIUS))
            return value * unitType.unitType + 32;
        return value * unitType.unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0 &&
                Double.compare(that.inch, inch) == 0;
    }
}