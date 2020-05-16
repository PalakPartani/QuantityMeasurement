package com.quantitymeasurement;

public class QuantityMeasurement {
    double feet;

    public double getFeet(double feet) {
        return feet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.feet, feet) == 0;
    }
}