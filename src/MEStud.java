public class MEStud extends EngStud {
    private String researchTopic;
    
    public void setMEInfo(String a){
        researchTopic=a;
    }
    public void showMEInfo(){
        System.out.println(researchTopic);
    }
    
}
