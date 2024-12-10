public class Appliance implements Controllable {

    private boolean status;

    @Override
    public void turnOn(){
        status = true; 
        System.out.println("Appliance turned on.");
    }

    @Override
    public void turnOff(){
        status = false; 
        System.out.println("Appliance turned off.");
    }

    @Override
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
}
