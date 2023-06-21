package vol3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //d
        int [] lottoZahlen = new int [6] ;//{4, 7, 9, 12, 16, 35}
        int [] eingabeZahlen = new int[6];
        int zahl, rndZahl, counter=0;
        Random rn = new Random();



        for (int i=0; i<lottoZahlen.length; i++){
            rndZahl= rn.nextInt(100);
            lottoZahlen[i]=rndZahl;
        }


        System.out.println("Bitte Lotto-Zahlen eingeben:");

        //c
        for (int i=0;i< eingabeZahlen.length; i++){
            System.out.print("Zahl"+(i+1) +": ");
            zahl=sc.nextInt();
            sc.nextLine();
            eingabeZahlen[i]=zahl;
        }


        //b
        System.out.println("Die richtigen Zahlen lauten: ");
        for (int e:lottoZahlen){
            System.out.println(e);
        }


        /*
        for (int i=0; i<lottoZahlen.length; i++)  {
            for (int j=0; j<eingabeZahlen.length;j++){
                if(lottoZahlen[i]==eingabeZahlen[j]){
                    counter++;
                }
            }
        }
         */

        Arrays.sort(lottoZahlen);
        Arrays.sort(eingabeZahlen);

        for (int i=0; i<lottoZahlen.length;i++){
            for (int j=0; j<eingabeZahlen[j];j++){
                if(lottoZahlen[i]==eingabeZahlen[i]){
                    counter++;
                }
            }
        }


        System.out.println("Es gibt: " + counter + " richtige Zahlen");


    }//Ende Main
} //Ende Class
