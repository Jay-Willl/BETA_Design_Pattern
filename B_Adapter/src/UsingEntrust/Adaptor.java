package UsingEntrust;

public class Adaptor extends RequiredPowerSource{

    private HighVoltPowerSource highVoltPowerSource;

    public Adaptor(int volt){
        this.highVoltPowerSource = new HighVoltPowerSource(volt);
    }

    @Override
    public void on() {
        highVoltPowerSource.open();
    }

    @Override
    public void receive() {
        highVoltPowerSource.provide();
    }
}
