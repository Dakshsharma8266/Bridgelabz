// Superclass
class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Demo
public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", "ON", 25.5);
        t1.displayStatus();
    }
}
