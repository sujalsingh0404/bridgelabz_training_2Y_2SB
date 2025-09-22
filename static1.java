class Device {
    String id;
    String status;
}

class Thermostat extends Device {
    int temp;
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.id = "T-01";
        t.status = "On";
        t.temp = 25;

        System.out.println("Device ID: " + t.id);
        System.out.println("Status: " + t.status);
        System.out.println("Temperature: " + t.temp + "°C");
    }
}
