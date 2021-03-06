package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;
import com.quantitymeasurement.exception.UnitException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;
    double value1, value2;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    //Feet
    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //negative scenario
    @Test
    public void givenTwoDifferentFeetValues_WhenNotEqual_ShouldReturnFalse() {
        value1 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(5.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(5.0, Units.FEET);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //Test exception
    @Test
    public void givenTwoEqualFeetValues_WhenNegative_ShouldThrowException() {
        try {
            value1 = quantityMeasurement.getConvertedUnit(-1.0, Units.FEET);
            value2 = quantityMeasurement.getConvertedUnit(5.0, Units.FEET);
        } catch (UnitException e) {
            Assert.assertEquals(UnitException.ExceptionType.NEGATIVE_VALUE, e.type);
        }
    }

    //Inch
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //negative scenario for feet
    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        value1 = quantityMeasurement.getConvertedUnit(2.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullInchValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObjectForInch_WhenEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(5.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(5.0, Units.INCH);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //Different units
    @Test
    public void givenZeroFeetAndZeroInch_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(0.0, Units.INCH);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeetAndOneInch_WhenNotEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
        double value2 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInchAndOneFeet_WhenNotEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeetAndTwelveInch_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(12.0, Units.INCH);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenTwelveInchAndOneFeet_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(12.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //YARD
    @Test
    public void givenThreeFeetAndOneYard_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneFeetAndOneYard_WhenNotEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneInchAndOneYard_WhenNotEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneYardAndThirtySixInch_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
        value2 = quantityMeasurement.getConvertedUnit(36.0, Units.INCH);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenThirtySixAndOneYardInch_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(36.0, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenOneYardAndThreeFeet_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.YARD);
        value2 = quantityMeasurement.getConvertedUnit(3.0, Units.FEET);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //CM
    @Test
    public void givenTwoInchAndFiveCm_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(2, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(5, Units.CM);
        Assert.assertEquals(value1, value2, 1.0);
    }

    //Compare lengths in inch
    @Test
    public void givenTwoInchesAndTwoInch_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(2, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(2, Units.INCH);
        Assert.assertEquals(4.0, value1 + value2, 1.0);
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(1, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(2, Units.INCH);
        Assert.assertEquals(14.0, value1 + value2, 1.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(1, Units.FEET);
        value2 = quantityMeasurement.getConvertedUnit(1, Units.FEET);
        Assert.assertEquals(24.0, value1 + value2, 1.0);
    }

    @Test
    public void givenTwoInchAndTwoPtFiveCm_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(2, Units.INCH);
        value2 = quantityMeasurement.getConvertedUnit(2.5, Units.CM);
        Assert.assertEquals(3.0, value1 + value2, 1.0);
    }

    //Volumes
    @Test
    public void givenOneGallonAndThreePtSevenEightLtrs_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1, Units.GALLON);
        value2 = quantityMeasurement.getConvertedUnit(3.78, Units.LITRE);
        Assert.assertEquals(value1, value2, 1.0);
    }

    @Test
    public void givenOneLiterAndThousandMl_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1, Units.LITRE);
        value2 = quantityMeasurement.getConvertedUnit(1000, Units.ML);
        Assert.assertEquals(value1, value2, 1.0);
    }

    //Addition of volumes
    @Test
    public void givenOneGallonAndThreePtSevenEightLtrs_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(1, Units.GALLON);
        value2 = quantityMeasurement.getConvertedUnit(3.78, Units.LITRE);
        Assert.assertEquals(value1, value2, 1.0);
    }

    @Test
    public void givenOneLitreAndMl_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.LITRE);
        value2 = quantityMeasurement.getConvertedUnit(1000.0, Units.ML);
        Assert.assertEquals(value1, value2, 1.0);
    }

    //Weights
    @Test
    public void givenOneKgAndThousandGrams_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.KG);
        value2 = quantityMeasurement.getConvertedUnit(1000.0, Units.GRAMS);
        Assert.assertEquals(value1, value2, 1.0);
    }

    @Test
    public void givenOneTonneAndThousandKgs_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.TONNE);
        value2 = quantityMeasurement.getConvertedUnit(1000.0, Units.KG);
        Assert.assertEquals(value1, value2, 1.0);
    }

    @Test
    public void givenOneTonneAndThousandGrams_WhenAdded_ShouldReturnCorrect() {
        value1 = quantityMeasurement.getConvertedUnit(1.0, Units.TONNE);
        value2 = quantityMeasurement.getConvertedUnit(1000.0, Units.GRAMS);
        Assert.assertEquals(1001, value1 + value2, 0.0);
    }

    //Temperature
    @Test
    public void givenTwoOneTwoFahrenheitAndHundredCelsius_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(212.0, Units.FAHRENHEIT);
        value2 = quantityMeasurement.getConvertedUnit(100.0, Units.CELCIUS);
        Assert.assertEquals(value1, value2, 0.0);
    }

    @Test
    public void givenHundredCelsiusTwoOneTwoFahrenheit_WhenEqual_ShouldReturnTrue() {
        value1 = quantityMeasurement.getConvertedUnit(100.0, Units.CELCIUS);
        value2 = quantityMeasurement.getConvertedUnit(212.0, Units.FAHRENHEIT);
        Assert.assertEquals(value1, value2, 0.0);
    }
}