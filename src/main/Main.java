package main;

import Parents.child.Crocodile;
import Parents.child.Eagle;
import Parents.child.Eel;

public class Main {
    public static void main(String[] args) {
        Crocodile lacoste = new Crocodile(200, 1000, "Reptile", "Unknown", "Dry skin", "Backbone", "Hard-shelled eggs");
        System.out.println(lacoste.showInfo());

        Eel eel = new Eel(50, 300, "Fish", "Unknown", true, true, true);
        System.out.println(eel.showInfo());

        Eagle desert = new Eagle(80, 400, "Birds", "Unknown", true, true);
        System.out.println(desert.showInfo());

    }

}
