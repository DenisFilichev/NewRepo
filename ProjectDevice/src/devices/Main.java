package devices;

import Interfeces.Device;
import Interfeces.Ethernet;
import Interfeces.Vga;

/**
 *
 * @author denis
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Pc("pc001", 600, 100);
        devices[0].turnOn();
        devices[1] = new Pc("pc002", 350, 100);
        devices[2] = new Projector("pj001", 300);
        
        for (Device device : devices){
            System.out.println(device.toString());
            if (device instanceof Ethernet){
                System.out.println("Ping = " + ((Ethernet) device).ping());
            }
        }

        if (devices[0] instanceof Vga && devices[2] instanceof Vga){
            Vga dev1 = (Vga)devices[0];
            Vga dev2 = (Vga)devices[2];
            dev1.connectDeviceToVga(dev2);
            dev2.connectDeviceToVga(dev1);
        }

    }
}
