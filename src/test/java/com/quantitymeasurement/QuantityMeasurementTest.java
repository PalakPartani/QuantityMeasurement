package com.quantitymeasurement;

import com.quantitymeasurement.enums.Units;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getConvertedUnit(0.0, Units.FEET);
        double value2 = quantityMeasurement.getConvertedUnit(0.0,Units.FEET);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //negative scenario
    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getConvertedUnit(3.0,Units.FEET);
        double value2 = quantityMeasurement.getConvertedUnit(1.0,Units.FEET);
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
        double value1 = quantityMeasurement.getConvertedUnit(5.0,Units.FEET);
        double value2 = quantityMeasurement.getConvertedUnit(5.0,Units.FEET);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //Inch
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getConvertedUnit(0.0,Units.INCH);
        double value2 = quantityMeasurement.getConvertedUnit(1.0,Units.INCH);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    //negative scenario
    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getConvertedUnit(2.0,Units.INCH);
        double value2 = quantityMeasurement.getConvertedUnit(1.0,Units.INCH);
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
        double value1 = quantityMeasurement.getConvertedUnit(5.0,Units.INCH);
        double value2 = quantityMeasurement.getConvertedUnit(5.0,Units.INCH);
        Assert.assertEquals(value1, value2, 0.0);
    }
}
