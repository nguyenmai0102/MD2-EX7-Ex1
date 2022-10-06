package resizeable;

public class Circle extends Shape implements  Resizeable{

    private double radius =1.0;
    public Circle(){

    }

    public Circle(double radius) {
        this.radius =radius;
    }

    public Circle(String color, boolean fiiled, double radius) {
        super(color, fiiled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea(){
        return  radius*radius*Math.PI;
    }
    public double getPerimetter(){
        return  2*radius* Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
       setRadius(this.radius*percent);
    }
}

