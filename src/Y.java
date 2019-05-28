public class Y extends X {
    
    int data=200;
    
    public void disp(){
        System.out.println("Welcome From Y");
    }
    
    public void show(){
        //System.out.println(super.data);
        super.disp();
    }
    
    public static void main(String args[]){
        Y ob=new Y();
        ob.show();
    }
}
