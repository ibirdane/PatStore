public class CellPhones extends Products{

    private int id;
    private double price;
    private double saleRate;
    private int stock;
    private String name;
    private String brand;
    private String ram;
    private String displaylen;
    private String memory;
    private String battery;
    private String colour;

    public CellPhones(int id, double price,double saleRate,int stock,String name,String brand, String ram,String displaylen,String memory,String battery,String colour){
        super(id,price,saleRate,stock,name,brand,ram,displaylen);
        this.memory=memory;
        this.battery=battery;
        this.colour=colour;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "CellPhones{" +
                "id=" + getId() +
                ", price=" + getPrice() +
                ", saleRate=" + getSaleRate() +
                ", stock=" + getStock() +
                ", name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", ram='" + getRam() + '\'' +
                ", displaylen='" + getDisplaylen() + '\'' +
                ", memory='" + getMemory() + '\'' +
                ", battery='" + getBattery() + '\'' +
                ", colour='" + getColour() + '\'' +
                '}';
    }
}
