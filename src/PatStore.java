import java.util.Iterator;
import java.util.Scanner;

public class PatStore {

    Inventory inv = new Inventory();
    Brands brands = new Brands();


    public void addNoteBook(Notebooks n){
            inv.noteBooks.add(n);
    }

    public void addCellPhone(CellPhones c){
        inv.cellPhones.add(c);
    }

    public void deleteNoteBook(int id){
       for(int i=0;i<inv.noteBooks.size();i++){
           if(inv.noteBooks.get(i).getId()==id){
               inv.noteBooks.remove(i);
           }
       }
    }

    public void deleteCellPhone(int idCell){
        for (int i=0;i<inv.cellPhones.size();i++){
            if(inv.cellPhones.get(i).getId()==idCell){
                inv.cellPhones.remove(i);
            }
        }
    }

    public void startShopping() {
        inv.NoteBooksinStock();
        inv.cellPhonesInStock();
       boolean isExit =true;
        while(isExit) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please select your option :\n1-Notebooks Operations \n2-Cell Phone Operations\n" +
                    "3-List the Brands\n4-Quit ");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("You have the following options : \n1-List the Notebooks in Inventory\n" +
                            "2-Add Notebook\n3-List Notebooks with id\n4-List Notebooks with brands\n5-Delete Notebook\n" +
                            "6-Return to menu \nWhat do you want next ? ");
                            int option = sc.nextInt();
                    if(option==1) {
                        inv.NoteBookInventory();
                    }else if(option==2) {
                        System.out.println("Please give the informations of the notebook that you want to add");
                        System.out.println("Name of the Notebook");
                        String nName = sc.next();
                        System.out.println("Id of the Notebook");
                        int nId = sc.nextInt();
                        System.out.println("Price of the Notebook");
                        double nPrice = sc.nextDouble();
                        System.out.println("Sale rate of the Notebook");
                        double nSaleRate = sc.nextDouble();
                        System.out.println("How much do you have in stock ?");
                        int nStock = sc.nextInt();
                        System.out.println("What is the brand of your notebook ?");
                        String nBrand = sc.next();
                        System.out.println("What is the Ram of your notebook ?");
                        String nRam = sc.next();
                        System.out.println("What is the display length of your notebook?");
                        String nDisplayLength = sc.next();
                        System.out.println("What is the ssd of your notebook ?");
                        String nSsd = sc.next();

                        addNoteBook(new Notebooks(nId, nPrice, nSaleRate, nStock, nName, nBrand, nRam, nDisplayLength, nSsd));

                        inv.NoteBookInventory();
                    }
                     else if(option==3) {
                        System.out.println("Please select the Id of your notebook :");
                        int idd = sc.nextInt();
                       for(int i=0;i<inv.noteBooks.size();i++){
                           if(inv.noteBooks.get(i).getId()==idd){
                               System.out.println(inv.noteBooks.get(i).toString());
                           }
                       }
                    }
                     else if (option==4){
                            System.out.println("Please select the brand of your notebook :");
                            String brandd= sc.next();
                            for(int i=0;i<inv.noteBooks.size();i++){
                                if(inv.noteBooks.get(i).getBrand().equalsIgnoreCase(brandd)){
                                    System.out.println(inv.noteBooks.get(i).toString());
                                }

                                }
                            }else if(option==5) {
                        System.out.println("Please give the id of the notebook that you want to delete:");
                        int deleteNotebook = sc.nextInt();
                        deleteNoteBook(deleteNotebook);
                        System.out.println("The notebook with the given id is deleted");
                    }else if(option==6){
                        System.out.println("Auf wiedersehen");
                }else {
                        System.out.println("Please give a valid option");
                    }
                     break;
                case 2:

                    System.out.println("You have the following options : \n1-List the Cellphones in Inventory\n" +
                            "2-Add Cellphone\n3-List Cellphone with id\n4-List Cellphone with brands\n5-Delete Cellphone\n" +
                            "6-Return to menu \nWhat do you want next ? ");
                    int optionn = sc.nextInt();
                    if(optionn==1) {
                        inv.NoteBookInventory();
                    }else if(optionn==2) {
                        System.out.println("Please give the informations of the cell phone that you want to add");
                        System.out.println("Name of the cell phone");
                        String cName = sc.next();
                        System.out.println("Id of the cell phone");
                        int cId = sc.nextInt();
                        System.out.println("Price of the cell phone");
                        double cPrice = sc.nextDouble();
                        System.out.println("Sale rate of the cell phone");
                        double cSaleRate = sc.nextDouble();
                        System.out.println("How much do you have in stock ?");
                        int cStock = sc.nextInt();
                        System.out.println("What is the brand of your cell phone ?");
                        String cBrand = sc.next();
                        System.out.println("What is the Ram of your cell phone ?");
                        String cRam = sc.next();
                        System.out.println("What is the display length of your cell phone?");
                        String cDisplayLength = sc.next();
                        System.out.println("What is the memory of your cell phone ?");
                        String cMemory = sc.next();
                        System.out.println("What is the battery of your cell phone ?");
                        String cBattery=sc.next();
                        System.out.println("What is the colour of your cell phone ?");
                        String cColour = sc.next();
                        addCellPhone(new CellPhones(cId, cPrice, cSaleRate, cStock, cName, cBrand, cRam, cDisplayLength, cMemory,cBattery,cColour));
                        inv.NoteBookInventory();
                    }
                    else if(optionn==3) {
                        System.out.println("Please select the Id of your cell phone :");
                        int idd = sc.nextInt();
                        for(int i=0;i<inv.cellPhones.size();i++){
                            if(inv.cellPhones.get(i).getId()==idd){
                                System.out.println(inv.cellPhones.get(i).toString());
                            }
                        }
                    }
                    else if (optionn==4){
                        System.out.println("Please select the brand of your cell phone :");
                        String brandd= sc.next();
                        for(int i=0;i<inv.cellPhones.size();i++){
                            if(inv.cellPhones.get(i).getBrand().equalsIgnoreCase(brandd)){
                                System.out.println(inv.cellPhones.get(i).toString());
                            }

                        }
                    }else if(optionn==5) {
                        System.out.println("Please give the id of the Cell Phone that you want to delete:");
                        int cellPhone = sc.nextInt();
                        deleteCellPhone(cellPhone);
                        System.out.println("The cell phone with the given id is deleted");
                    }else if(optionn==6){
                        System.out.println("Auf wiedersehen");
                    }else {
                        System.out.println("Please give a valid option");
                    }
                    break;


                case 3:
                    System.out.println("Our brands are :");
                    brands.getBrands();
                    break;
                case 4:
                    System.out.println("Thanks for your visit ");
                    isExit=false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }


    }
}
