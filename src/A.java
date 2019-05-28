public class A {
 
    final int MAX=100;
    
    void show(final int p){
        System.out.println(p);
        //p=p+1;
        System.out.println(p);
    }
    
    void display(){
        System.out.println("Welcome From A");
    }
    
    public static void main(String args[]){
        A ob=new A();
        ob.show(100);
        
        
    }
    
}
