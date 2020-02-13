package com.point.Point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void Positiveornegative(){
        Point pointtest1=new Point(1,1);
        assertEquals("Positive",pointtest1.PositiveOrNegative(1));
        assertEquals("Negative",pointtest1.PositiveOrNegative(-1));
    }
    @Test
    void Quadrant(){
        Point pointtest1=new Point(1,1);
        Point pointtest2=new Point(-1,1);
        Point pointtest3=new Point(-1,-1);
        Point pointtest4=new Point(1,-1);
        assertEquals("Quadrant "+"1"+"\n    |\n    | X\n----|----\n    |\n    |",pointtest1.Quadrant());
        assertEquals("Quadrant "+"2"+"\n    |\n  X |\n----|----\n    |\n    |",pointtest2.Quadrant());
        assertEquals("Quadrant "+"3"+"\n    |\n    |\n----|----\n  X |\n    |",pointtest3.Quadrant());
        assertEquals("Quadrant "+"4"+"\n    |\n    |\n----|----\n    | X\n    |",pointtest4.Quadrant());
    }

}