package devices;

import Interfeces.Device;
import Interfeces.Ethernet;
import Interfeces.Vga;

public class Pc extends Device implements Ethernet, Vga{
    
    private int speed;
    private Vga connectDeviceVga;
    private Ethernet connectDeviceEthernet;

    public Pc(String serial, int power, int speed){
        super(serial, power);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String ping() {
        return status ? "OK" : "NO";
    }
    
    @Override
    public void connectDeviceToVga(Vga connectDeviceVga) {
            this.connectDeviceVga = connectDeviceVga;
    }
    
    @Override
    public void connectDeviceToEthernet (Ethernet connectDeviceEthernet){
        this.connectDeviceEthernet = connectDeviceEthernet;
    }

    @Override
    public String toString() {
        return "Computer{" + 
                        "status=" + (status ? "ON" : "OFF") + 
                        ", s/n:" + getSerial() + 
                        ", speed=" + speed + 
                        ", power=" + getPower() + '}';
    }
}
