

package com.company;
import java.util.Scanner;

public class Main {

    public static Board board;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String answer;
        do {
            board = new Board();
            board.draw();

            boolean notWin = true;

            while (notWin && !board.checkFull()) {

                notWin = play(" X ");
                board.draw();

                if (notWin && !board.checkFull()) {
                    notWin = play(" O ");
                    board.draw();

                }
                if (notWin && board.checkFull()) {
                    System.out.println("Oavgjort!\n");

                }
            }

            System.out.println("\nVill ni spela igen? (ja/nej)");
            answer = sc.nextLine();

        } while ("ja".equals(answer));

    }

    public static boolean play(String piece) {

        Boolean same = false;
        while (same == false) {
            int i = -1;
            while (i < 0 || i > 9)
            {
                try {
                    System.out.println("\nSpelare" + piece + ", vilken ruta (1-9)?");
                    String input = sc.nextLine();
                    i = Integer.parseInt(input);
                } catch (Exception e) {
                    System.out.println("Fel!");
                }
            }

            same = board.placePiece(i, piece);

            if (board.win() == true) {
                System.out.println("Spelare" + piece + "vann!\n");
                return false;

            }

        }

        return true;
    }

}
