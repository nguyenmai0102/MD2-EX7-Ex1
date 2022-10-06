package resizeable;

public class Shape implements Resizeable{
    private  String color = "green";

    private boolean fiiled = true;
    public Shape(){

    }

    public Shape(String color, boolean fiiled) {
        this.color = color;
        this.fiiled = fiiled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiiled() {
        return fiiled;
    }

    public void setFiiled(boolean fiiled) {
        this.fiiled = fiiled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fiiled=" + fiiled +
                '}';
    }

    @Override
    public void resize(double percent) {

    }
}
