public class University {
    public static void main(String args[]){
        
        EngStud s1=new EngStud();
        s1.setPersonalInfo(111, "AAA");
        s1.setEngInfo("CS", 3);
        s1.showPersonalInfo();
        s1.showEngInfo();
        s1.result(40);
        System.out.println("________________________________");
        MediStud s2=new MediStud();
        s2.setPersonalInfo(112, "BBB");
        s2.setMediInfo(3);
        s2.showPersonalInfo();
        s2.showMediInfo();
        s2.result(43);
        System.out.println("________________________________");
        MEStud s3=new MEStud();
        s3.setPersonalInfo(113, "CCC");
        s3.setEngInfo("Mech", 3);
        s3.setMEInfo("AutomaticCNC");
        s3.showPersonalInfo();
        s3.showEngInfo();
        s3.showMEInfo();
        s3.result(44);
        
    }
}
