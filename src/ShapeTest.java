public class ShapeTest {
    public static void main(String[] args) {

//        Shape s1 = new Shape();
//        System.out.println(s1);
//        Shape s2 = new Shape("red", false);
//        System.out.println(s2);
//
//        Circle circle = new Circle(33.3, "yellow", false);
//        System.out.println(circle);
//        System.out.printf("The circle area is: %.4f\n", circle.getArea());
//        System.out.printf("The circle perimeter is: %.4f\n", circle.getPerimeter());
//
//        Rectangle rectangle = new Rectangle(10, 8);
//        System.out.println(rectangle);
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());

        Square square = new Square(5, "black", false);

        square.setLength(10);
        //square.setWidth(20);
        //square.setSide(15);
        System.out.println(square.getLength());
        System.out.println(square.getWidth());
        System.out.println(square);

        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
