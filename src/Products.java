public abstract class Products {

    private int id;
    private double price;
    private double saleRate;
    private int stock;
    private String name;
    private String brand;
    private String ram;
    private String displaylen;

    public Products(int id, double price,double saleRate,int stock,String name,String brand, String ram,String displaylen){
        this.id=id;
        this.price=price;
        this.saleRate=saleRate;
        this.stock=stock;
        this.name=name;
        this.brand = brand;
        this.ram=ram;
        this.displaylen=displaylen;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(double saleRate) {
        this.saleRate = saleRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisplaylen() {
        return displaylen;
    }

    public void setDisplaylen(String displaylen) {
        this.displaylen = displaylen;
    }
}
