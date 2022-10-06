package resizeable;




public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8);
        shapes[1] = new Rectangle(3,5);
       shapes[2] = new Square(5);
        System.out.println("kich thuoc ban dau");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);

        }
        // ve kich thuoc
        System.out.println("kich thuoc sau khi doi");
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(Math.random()*100);
            System.out.println(shapes[i]);
        }
    }

}