package com.company;

import java.util.ArrayList;

public class Board

{
    private ArrayList<String> rutor = new ArrayList<>();
    private int pices = 0;

    public Board() {

        for (int i = 0; i < 9; i++)
            rutor.add("   ");

    }


    public boolean placePiece(int place, String piece) {

        if (rutor.get(place - 1).equals("   ")) {
            rutor.set(place - 1, piece);
            pices++;
            return true;
        }
        System.out.println("Upptagen!");
        return false;
    }

    public void draw() {

        System.out.println(rutor.get(0) + "|" + rutor.get(1) + "|" + rutor.get(2));
        System.out.println("---+---+---");
        System.out.println(rutor.get(3) + "|" + rutor.get(4) + "|" + rutor.get(5));
        System.out.println("---+---+---");
        System.out.println(rutor.get(6) + "|" + rutor.get(7) + "|" + rutor.get(8));

    }

    public boolean checkFull() {
        if (pices == 9)
            return true;
        return false;
    }


    public boolean win() {


        if (!rutor.get(0).equals("   ") && rutor.get(0).equals(rutor.get(1)) && rutor.get(0).equals(rutor.get(2))) {
                return true;
        }

        if (!rutor.get(2).equals("   ") && rutor.get(2).equals(rutor.get(4)) && rutor.get(2).equals(rutor.get(6))) {
                return true;
        }

        if (!rutor.get(0).equals("   ") && rutor.get(0).equals(rutor.get(3)) && rutor.get(0).equals(rutor.get(6))) {
                return true;
        }

        if (!rutor.get(3).equals("   ") && rutor.get(3).equals(rutor.get(4)) && rutor.get(3).equals(rutor.get(5))) {
                return true;
        }

        if (!rutor.get(0).equals("   ") && rutor.get(0).equals(rutor.get(4)) && rutor.get(0).equals(rutor.get(8))) {
                return true;
        }

        if (!rutor.get(6).equals("   ") && rutor.get(6).equals(rutor.get(7)) && rutor.get(6).equals(rutor.get(8))) {
                return true;
        }

        if (!rutor.get(1).equals("   ") && rutor.get(1).equals(rutor.get(4)) && rutor.get(1).equals(rutor.get(7))) {
                return true;
        }

        if (!rutor.get(2).equals("   ") && rutor.get(2).equals(rutor.get(5)) && rutor.get(2).equals(rutor.get(8))) {
                return true;
        }

        return false;
    }
}
