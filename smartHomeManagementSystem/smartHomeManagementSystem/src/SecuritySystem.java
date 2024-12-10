public class SecuritySystem extends Appliance{
    
    public void activateAlarm(){
        if(getStatus()){
            System.out.println("Activating alarm."); 
        }
        else{
            System.out.println("Security system is off cannot activate alarm.");
        }
    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("Security system turned on.");
    }

    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("Security system turned off.");
    }
}
