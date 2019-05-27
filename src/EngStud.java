public class EngStud extends Stud {
    
    private int sem;
    private String branch;
    
    public void setEngInfo(String a, int b){
        branch=a;
        sem=b;
    }
    public void showEngInfo(){
        System.out.println(branch+","+sem);
    }
    
}
