package com.vikram_package;
import java.awt.*;

class Circle
{
    Point center;
    double radius;

    Circle (Point initialPoint, double initialRadius){
        center = initialPoint;
        radius = initialRadius;
    }

    Circle(){  // creating with defaul value, we can leave it empty also
        center = new Point(0,0); 
        radius = 1;
    }

    public static void main (String a[]) {
        Circle c1 = new Circle(new Point(1,2),3);
        System.out.println(c1.center);
        System.out.println(c1.radius);

        Circle c2 = new Circle();
        System.out.println(c2.center);
        System.out.println(c2.radius);
    }
}
