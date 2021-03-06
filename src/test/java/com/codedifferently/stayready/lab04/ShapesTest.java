package com.codedifferently.stayready.lab04;


import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {



    @Test
    public void triangleTest(){

        //: Given
        Shapes shapes = new Shapes();
        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****\n";

        //: When
        String actual = shapes.triangle();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        Shapes shapes = new Shapes();
        String expected =  "tableSquare()\n" + "*** Output ***\n" +
                             "|  1 |  2 |  3 |  4 |\n" +
                             "|  2 |  4 |  6 |  8 |\n" +
                             "|  3 |  6 |  9 | 12 |\n" +
                             "|  4 |  8 | 12 | 16 |\n" ;

        //: When
        String actual = shapes.tableSquare();

        //: Then
        Assert.assertEquals(expected, actual);
    }
}
