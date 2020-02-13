package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDistanceTest {

    @Test
    public void testDistance(){
        Point p1=new Point();
        Point p2=new Point();
        p1.x=1;
        p1.y=3;
        p2.x=5;
        p2.y=6;
        assert Point.oneMoreDistance(p1,p2)==5.0;
        Assert.assertEquals(Point.oneMoreDistance(p1,p2),5.0);
    }
}