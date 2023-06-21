package vol2;

import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        System.out.println("Bitte vier Zahlen eingeben:");
        int a1 = keyScan.nextInt();
        int a2 = keyScan.nextInt();
        int a3 = keyScan.nextInt();
        int a4 = keyScan.nextInt();
        int nr; //größte Nr.

        //d
        if (a1>=a2 && a1>=a3 && a1>=a4) {
            nr=a1;
        }
        else if (a2>=a3 && a2>=a4 && a2>=a1) {
            nr=a2;
        }
        else if (a3>=a2 && a3>=a1 && a3>=a4) {
            nr=a3;
        }
        else
            nr=a4;

        System.out.println("Die grösste eingegebene Zahl ist: "+ nr);



    }//Ende Main
}//Ende Class
