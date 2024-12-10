public class Thermostat extends Appliance{

    public void setTemperature(){
        if(getStatus()){
            System.out.println("Setting temperature.");
        }
        else{
            System.out.println("Thermostat is off cannot set temperature.");
        }
    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("Thermostat turned on.");
    }

    @Override
    public void turnOff(){
        super.turnOff();
        System.out.println("Thermostat turned off.");
    }
}
