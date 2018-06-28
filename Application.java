public class Application {
    public static void main(String[] args) {
        double width = 5;
        double height = 10;
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Dien tich hinh chu nhat la: " +rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat la: " + rectangle.getPerimeter());

    }

}
