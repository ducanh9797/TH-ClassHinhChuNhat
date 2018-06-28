public class Rectangle {
    double width, hieght;

    public Rectangle(double width, double hieght) {
        this.width = width;
        this.hieght = hieght;
    }

    public double getArea() {
        return this.width * this.hieght;
    }

    public double getPerimeter() {
        return (this.width + this.hieght) * 2;
    }
}

