public class Q extends P {
    
    public Q(){
        super(1,2);
        System.out.println("Q-0");
    }
    public Q(int a, int b){
        super(1,2,3);
        System.out.println("Q-2");
    }
    public Q(int a, int b, int c){
        super(1,2);
        System.out.println("Q-3");
    }
    
    public static void main(String args[]){
        
        Q ob=new Q(10,25,30);
        
    }
    
    
}
