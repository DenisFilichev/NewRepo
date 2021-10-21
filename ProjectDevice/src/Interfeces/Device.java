package Interfeces;

public abstract class Device {
    private final String serial;
    protected boolean status = false;
    private int power;
    
    public Device (String serial, int power){
        this.serial = serial;
        this.power = power;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setPower(int power){
        this.power = power;
    }

    public String getSerial() {
        return serial;
    }

    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        status = true;
    }
    
    public void turnOff() {
        status = false;
    }
}
