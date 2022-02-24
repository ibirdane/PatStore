public class Notebooks extends Products{

    private int id;
    private double price;
    private double saleRate;
    private int stock;
    private String name;
    private String brand;
    private String ram;
    private String displaylen;
    private String ssd;

    public Notebooks(int id, double price,double saleRate,int stock,String name,String brand, String ram,String displaylen,String ssd){
        super(id,price,saleRate,stock,name,brand,ram,displaylen);
        this.ssd=ssd;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "id=" + getId() +
                ", price=" + getPrice() +
                ", saleRate=" + getSaleRate() +
                ", stock=" + getStock() +
                ", name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", ram='" + getRam() + '\'' +
                ", displaylen='" + getDisplaylen() + '\'' +
                ", ssd='" + getSsd() + '\'' +
                '}';
    }
}
