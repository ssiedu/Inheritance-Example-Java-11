public class MediStud extends Stud {
    private int prof;
    
    public void result(int marks){
        if(marks>=50){
            System.out.println("MediStud Passed");
        }else{
            System.out.println("MediStud Failed");
        }
    }
    public void setMediInfo(int a){
        prof=a;
    }
    public void showMediInfo(){
        System.out.println(prof);
    }
}
