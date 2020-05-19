package com.quantitymeasurement.enums;

public enum Units {
    //Base unit conversion
    //Length
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0), CM(1 / 2.54),
    //Volume
    GALLON(1 * 3780.0), LITRE(1 * 1000.0), ML(1.0),
    //Weight
    KG(1.0), GRAMS(1.0 / 1000.0), TONNE(1.0 * 1000.0),
    //Temperature
    FAHRENHEIT(1.0), CELCIUS(1.8);

    public double unitType;

    Units(double unit) {
        unitType = unit;
    }
}
