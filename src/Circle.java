public class Circle extends Shape {

    public Circle(){
        System.out.println("Circle Class Constructor");
    }
    
    public void info(){
        System.out.println("Its A Circular Shape");
    }
    public void calculateArea() {
        double r=getRadius();
        double area=3.14*r*r;
        System.out.println("Area of Circle  : "+area);
                
    }

    public static void main(String args[]){
        
        Shape s;
        s=new Circle();
        s.setRadius(10);
        s.calculateArea();
        
        
        
    }
}
