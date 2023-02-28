package Homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testPoint() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,4);
        Assert.assertEquals( p1.distance(p2), 1.4142135623730951);
    }
    @Test
    public void testPoint1() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0,0);
       Assert.assertEquals( p1.distance(p2), 0.0);
    }

    @Test
    public void testPoint2() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,4);
        Assert.assertNotEquals( p1.distance(p2), -50);
    }

    @Test
    public void testPoint3() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,4);
        Assert.assertNotEquals( p1.distance(p2), -1.4142135623730951);
    }

}
