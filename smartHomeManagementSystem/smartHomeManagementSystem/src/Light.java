public class Light extends Appliance{

    public void controlLight(){
        if(getStatus()){
            System.out.println("Controlling light settings.");
        }
        else{
            System.out.println("Light is off cannot control settings.");
        }
    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("Light turned on.");
    }

    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("Light turned off.");
    }
}
