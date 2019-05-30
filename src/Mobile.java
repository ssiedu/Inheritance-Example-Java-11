public class Mobile {

private SIM sim;

public void insertSIM(SIM s){
    sim=s;
}

public void makeCall(){
    sim.call();
}
public void sendSMS(){
    sim.message();
}
    
public static void main(String args[]){
    Mobile mobile=new Mobile();
    mobile.insertSIM(new IdeaSIM());
    //mobile.insertSIM(new AirtelSIM());
    mobile.makeCall();
    mobile.sendSMS();
}    
    
}
