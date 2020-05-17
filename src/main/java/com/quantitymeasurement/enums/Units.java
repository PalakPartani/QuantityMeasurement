package com.quantitymeasurement.enums;

public enum Units {
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36), CM(1/2.54);

    public double unitType;

    Units(double unit) {
        unitType = unit;
    }
}
