public abstract class AbstractDemo {

    static void display(){
        System.out.println("hello ");
    }
    void f1(){
        System.out.println("welcome from f1");
    }
    void f2(){
        System.out.println("welcome from f2");
    }
    
    abstract void f3();
    
    abstract void f4();
    
    public static void main(String args[]){
        System.out.println("Its in main of abstract class");
    }
    
}
