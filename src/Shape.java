public abstract class Shape {

    private double radius;

    public Shape(){
        System.out.println("Shape Class Constructor");
    }
    public void info(){
        System.out.println("Its A Shape");
    }
    
    public final double getRadius() {
        return radius;
    }

    public final void setRadius(double r) {
        radius = r;
    }

    public abstract void calculateArea();
    
}
