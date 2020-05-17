package com.quantitymeasurement.enums;

public enum Units {
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0), CM(1/2.54), GALLON(1*3780.0), LITRE(1*1000.0),ML(1.0), KG(1*1000.0), GRAMS(1.0), TONNE(1*1000000.0);

    public double unitType;

    Units(double unit) {
        unitType = unit;
    }
}
