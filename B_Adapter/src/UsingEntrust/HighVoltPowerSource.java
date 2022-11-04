package UsingEntrust;

public class HighVoltPowerSource {
    private int volt;
    public HighVoltPowerSource(int volt){
        this.volt = volt;
    }

    public void provide(){
        System.out.println("provide 220V power");
    }

    public void open(){
        System.out.println("power on");
    }
}
