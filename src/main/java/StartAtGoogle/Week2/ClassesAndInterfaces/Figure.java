package StartAtGoogle.Week2.ClassesAndInterfaces;

abstract class Figure {
    public Figure() {

    }

  //  enum Shape {RECTANGLE, CIRCLE}
    double area() {

        return 0;
    }

}
class Square extends Figure {
    double length;

    void Rectangle(double length) {this.length = length;}

    @Override
    public double area(){
        return length * length;
    }

}

class Rectangle extends Figure {
    double length;
    double width;

    void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return length * width;
    }

}

class Circle extends Figure {
    double radius;
    void Circle(double radius) {
        this.radius=radius;
    }
    @Override
    public double area(){
        return Math.PI * (radius * radius);
    }

}