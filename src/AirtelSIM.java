public class AirtelSIM implements SIM {

    
    public void call() {
        System.out.println("Calling Using Airtel");
    }

    @Override
    public void message() {
        System.out.println("Messaging Using Airtel");
    }
    
}
