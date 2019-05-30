
public class Stud {

    private int rno;
    private String name;
    
    public void setRno(int r){
        rno=r;
    }
    public void setName(String s){
        name=s;
    }
    
                //111        AAA
    public Stud(int a, String b) {
        rno = a;
        name = b;
    }

    public void show() {
        System.out.println(rno + "," + name);
    }

    protected void result(int marks) {
        if (marks >= 33) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
    }

}
