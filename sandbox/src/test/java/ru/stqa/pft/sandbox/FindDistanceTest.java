package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDistanceTest {

    @Test
    public void testDistance(){
        Point p1=new Point(1,3);
        Point p2=new Point(5,6);
        assert p1.distance(p2)==5.0;
        Assert.assertEquals(p1.distance(p2),5.0);
    }
}