package bibSystem;

import Prog1Tools.IOTools;

public class Interface{
    String[] auswahl = {"1: Buch eingeben", "2: Bücher ausgeben"};

    public void draw(){
        System.out.println("-------- Willkommen im BibSystemMLL 2024 --------");
        menu1();
    }

    public void menu1(){
        System.out.println("Aktionsauswahl: ");
        for (String punkt: auswahl){
            System.out.println(punkt);
        }
        String eing = IOTools.readLine("Was möchten Sie tun?: ");

    }
}
