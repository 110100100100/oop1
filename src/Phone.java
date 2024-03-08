public abstract class Phone {
    private String brand;
    private String model;
    private int price;

    public Phone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void call();

    public abstract void sendMessage();

    public abstract void takePicture();
}

class Smartphone extends Phone {
    private String os;
    private double screenSize;

    public Smartphone(String brand, String model, int price, String os, int screenSize) {
        super(brand, model, price);
        this.os = os;
        this.screenSize = screenSize;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void call() {
        System.out.println("Calling from " + getBrand() + " " + getModel() + " smartphone!");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message from " + getBrand() + " " + getModel() + " smartphone!");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture with " + getBrand() + " " + getModel() + " smartphone!");
    }
}

class FeaturePhone extends Phone {
    private String keyboard;
    private int batteryLife;

    public FeaturePhone(String brand, String model, int price, String keyboard, int batteryLife) {
        super(brand, model, price);
        this.keyboard = keyboard;
        this.batteryLife = batteryLife;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void call() {
        System.out.println("Calling from " + getBrand() + " " + getModel() + " feature phone!");
    }

    @Override
    public void sendMessage() {
        System.out.println("Sending message from " + getBrand() + " " + getModel() + " feature phone!");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture with " + getBrand() + " " + getModel() + " feature phone!");
    }
}

class FoldablePhone extends Phone {
    private boolean isFolded;
    private int unfoldedScreenSize;

    public FoldablePhone(String brand, String model, int price, boolean isFolded, int unfoldedScreenSize) {
        super(brand, model, price);
        this.isFolded = isFolded;
        this.unfoldedScreenSize = unfoldedScreenSize;
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void setFolded(boolean isFolded) {
        this.isFolded = isFolded;
    }

    public int getUnfoldedScreenSize() {
        return unfoldedScreenSize;
    }

    public void setUnfoldedScreenSize(int unfoldedScreenSize) {
        this.unfoldedScreenSize = unfoldedScreenSize;
    }

    @Override
    public void call() {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void takePicture() {

    }
}
class Product{
    public static void main(String[] args) {
     Phone smallPhone = new Smartphone("Iphone","IphoneX", 599, "IOS", 6 );
     smallPhone.call();
     smallPhone.sendMessage();
     smallPhone.takePicture();
     Phone featurePhone = new FeaturePhone("Nokia","Nokia1280",20, "rubber keys",72);
     featurePhone.call();
     featurePhone.sendMessage();
     featurePhone.takePicture();
     Phone foldablePhone = new FoldablePhone("Samsung","Galaxy Fold", 799, true, 10);
     foldablePhone.call();
     foldablePhone.sendMessage();
     foldablePhone.takePicture();
    }
}