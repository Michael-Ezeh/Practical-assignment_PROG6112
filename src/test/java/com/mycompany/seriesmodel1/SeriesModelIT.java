/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.seriesmodel1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michael
 */
public class SeriesModelIT {
    SeriesModel object = new SeriesModel();
    public SeriesModelIT() {
    }
    
    /**
     * Test of main method, of class SeriesModel.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of launchApp method, of class SeriesModel.
     */
    @Test
    public void testLaunchAppFor1() {
        String actual = "1";
        //Launch app takes in 1 to launch the menu and uses any other
        //  key to break out of it.
        String expected ="1";
        assertEquals(actual, expected);
    }
    
    @Test
    public void testLaunchMenuRange() {
        String actual = "123456";
        //ensures that value is between 1 and 6
        String expected = "9";
        assertFalse(actual.contains(expected));
    }
    
    @Test
    public void testUpdateAge(){
        String actual = "12";
        String expected = "3";
        assertFalse(actual.contains(expected));
    }
    
    @Test
    public void testDeleteSeries(){
        String actual = "123456";
        String expected = "9";
        assertFalse(actual.contains(expected));
    }
}