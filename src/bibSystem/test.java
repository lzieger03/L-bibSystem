package bibSystem;

import Prog1Tools.IOTools;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Book> buecher = new ArrayList<>();
        int bookcount = 0;

        boolean weiter;
        do{
            buecher.add(new Book());
            buecher.get(bookcount++).eingabe();
            String eing = IOTools.readLine("Möchten Sie fortfahren? (j|n): ");

            if (eing.equalsIgnoreCase("j")){
                weiter = true;
            } else {
                weiter = false;
            }
        } while(weiter);

        for(Book buch: buecher){
            if(buch == null){
                break;
            }
            System.out.println(buch);
        }

        buecher.remove(0);

        for(Book buch: buecher){
            if(buch == null){
                break;
            }
            System.out.println(buch);
        }

        /*
        try {
            buecher[0] = new Book("Marven", "Drechsel", "Dies ist ein Testtitel", "testGenre", 2000, "128362173672143");
            System.out.println(buecher[0]);
        } catch (Exception e){
            System.out.println(e);
        }
        */
    }
}
