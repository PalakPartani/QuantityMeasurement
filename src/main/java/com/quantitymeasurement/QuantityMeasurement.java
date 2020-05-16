package com.quantitymeasurement;

public class QuantityMeasurement {
    double feet;
    double inch;

    public double getFeet(double inch) {
        return inch / 12;
    }

    public double getInch(double feet) {
        return feet * 12;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0;
    }
}