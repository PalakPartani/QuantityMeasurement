package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;

public class QuantityMeasurement {
    double feet;
    double inch;

    public double getConvertedUnit(double unit, Units unitType) {
        return unit * unitType.unitType;
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