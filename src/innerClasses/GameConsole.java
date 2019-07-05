package innerClasses;

public class GameConsole {
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public void setFirstGamepad(Gamepad firstGamepad) {
        this.firstGamepad = firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public void setSecondGamepad(Gamepad secondGamepad) {
        this.secondGamepad = secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getSerial() {
        return serial;
    }

    private final String brand;
    private final String model;
    private final String serial;
    private Gamepad firstGamepad;
    private Gamepad secondGamepad;
    private boolean isOn;
    public GameConsole(String brand, String serial, String model) {
        this.brand = brand;
        this.serial = serial;
        this.model = model;
        firstGamepad = new Gamepad("SONY", 1);
        secondGamepad = new Gamepad ("MICROSOFT", 2);
    }

    class Gamepad{
        final private String brand;
        final private String consoleSerial;
        final private int connectedNumber;
        private String color;
        private double chargeLevel;
        private boolean isOn;
        public Gamepad(String brand, int connectedNumber){
            this.brand = brand;
            this.connectedNumber = connectedNumber;
            consoleSerial = serial;
        }

        public String getBrand() {
            return brand;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public void setChargeLevel(double chargeLevel) {
            this.chargeLevel = chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }

        public void setOn(boolean on) {
            isOn = on;
        }

        public String getConsoleSerial() {
            return consoleSerial;

        }

        public int getConnectedNumber() {
            return connectedNumber;
        }


    }
}

