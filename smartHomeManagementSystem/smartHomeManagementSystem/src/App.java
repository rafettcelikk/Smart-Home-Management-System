public class App {
    public static void main(String[] args){
       Light light = new Light();
       light.turnOn();
       light.controlLight();
       light.turnOff();

       Thermostat thermostat = new Thermostat();
       thermostat.turnOn();
       thermostat.setTemperature();
       thermostat.turnOff();

       SecuritySystem securitySystem = new SecuritySystem();
       securitySystem.turnOn();
       securitySystem.activateAlarm();
       securitySystem.turnOff();
    }
}
