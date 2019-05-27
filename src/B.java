
public class B extends A {

    //we are overriding the display method of parent A
    public void display(){
        System.out.println("Welcome From B");
    }
    
    public static void main(String args[]) {
        B ob=new B();
        ob.display();
    }
}
