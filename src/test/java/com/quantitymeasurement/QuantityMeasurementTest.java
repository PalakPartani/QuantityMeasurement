package com.quantitymeasurement;

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
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //negative scenario
    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getFeet(0.0);
        double value2 = quantityMeasurement.getFeet(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullFeetValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObject_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement feetMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, feetMeasurement2);
    }

    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(5.0);
        double value2 = quantityMeasurement.getFeet(5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //Inch
    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getInch(0.0);
        double value2 = quantityMeasurement.getInch(0.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    //negative scenario
    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse() {
        double value1 = quantityMeasurement.getInch(0.0);
        double value2 = quantityMeasurement.getInch(1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    @Test
    public void givenNullInchValue_ShouldReturnFalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    @Test
    public void givenReferenceObjectForInch_WhenEqual_ShouldReturnTrue() {
        QuantityMeasurement feetMeasurement2 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, feetMeasurement2);
    }

    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue() {
        double value1 = quantityMeasurement.getFeet(5.0);
        double value2 = quantityMeasurement.getFeet(5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }
}
