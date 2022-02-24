import java.util.*;

public class Brands implements Comparable<Brands>{



    public String name;
    TreeSet<Brands> brandNames = new TreeSet<>();

    public Brands(){}
    public Brands(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void getBrands(){
        ArrayList<String>brandsList =new ArrayList<>();
        brandsList.add("Casper");
        brandsList.add("Monster");
        brandsList.add("HP");
        brandsList.add("Apple");
        brandsList.add("Samsung");
        brandsList.add("Asus");
        brandsList.add("Lenovo");
        brandsList.add("Xiaomi");
        brandsList.add("MSI");
        brandsList.add("Huawei");

        Collections.sort(brandsList);
        for (String brand : brandsList) {
            System.out.println("*"+brand);
        }

    }


    @Override
    public int compareTo(Brands o) {
        return this.name.compareTo(o.getName());
    }
}
