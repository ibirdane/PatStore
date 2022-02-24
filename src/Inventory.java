import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
    List<Notebooks> noteBooks = new ArrayList<>();
    List<CellPhones>cellPhones=new ArrayList<>();
    public void NoteBooksinStock(){

        noteBooks.add(new Notebooks(1, 1750.0, 0.07, 32, "Air", "Apple", "16 GB", "13.3", "512 MB"));
        noteBooks.add(new Notebooks(2, 2250.0, 0.1, 32, "Pro", "Apple", "16 GB", "13.3", "1 TB"));
        noteBooks.add(new Notebooks(3, 550.0, 0.05, 32, "Yoga X1", "Lenovo", "8 GB", "13.3", "256 MB"));
        noteBooks.add(new Notebooks(4, 1750.0, 0.09, 32, "Galaxy", "Samsung", "16 GB", "13.3", "1 TB"));
        noteBooks.add(new Notebooks(5, 1750.0, 0.03, 32, "Gamer Pro", "MSI", "32 GB", "13.3", "1 TB"));

    }


    public void NoteBookInventory() {

        Iterator<Notebooks> itr = noteBooks.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }

    public void cellPhonesInStock(){

        cellPhones.add(new CellPhones(1,650.0,0.0,25,"Iphone x","Apple","8 GB","7.0","64 GB","1200 KW","Red"));
        cellPhones.add(new CellPhones(2,900.0,0.05,20,"Iphone 12","Apple","16 GB","6.0","64 GB","700 KW","Black"));
        cellPhones.add(new CellPhones(3,550.0,0.1,23,"S20","Samsung","8 GB","6.3","32 GB","1000 KW","Blue"));
        cellPhones.add(new CellPhones(4,300.0,0.3,12,"Mate Pro","Huawei","4 GB","5.0","16 GB","100 KW","White"));
        cellPhones.add(new CellPhones(5,600.0,0.06,5,"Iphone 13 Pro","Apple","16 GB","8.0","128 GB","2000 KW","Pink"));
    }

        public void cellPhoneInventory(){

            Iterator<CellPhones> itr2 = cellPhones.iterator();
            while (itr2.hasNext()){
                System.out.println(itr2.next().toString());
            }



    }



}
