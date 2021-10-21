package devices;

import Interfeces.Device;
import Interfeces.Vga;

public class Projector extends Device implements Vga{
    
    private Vga connectDeviceVga;

    public Projector (String serial, int power){
        super(serial, power);
    }
    
    @Override
    public void connectDeviceToVga(Vga connectDeviceVga) {
            this.connectDeviceVga = connectDeviceVga;
    }

    @Override
    public String toString() {
        return "Projector{" + "serial=" + getSerial() + ", power=" + getPower() + '}';
    }
}
