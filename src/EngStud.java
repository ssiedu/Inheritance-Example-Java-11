public class EngStud extends Stud {
    
    private int sem;
    private String branch;
                    //111       AAA       CS     3
    public EngStud(int p, String q, String r, int s){
        super(p,q);
        branch=r;
        sem=s;
    }
    
    
    public void show(){
        super.show();
        System.out.println(branch+","+sem);
    }
    
    public static void main(String args[]){
        
        EngStud s1=new EngStud(111,"AAA","CS",3);
        s1.show();
    }
}
