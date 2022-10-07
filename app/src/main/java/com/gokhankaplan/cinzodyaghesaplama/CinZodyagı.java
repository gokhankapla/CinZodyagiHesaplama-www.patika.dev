package com.gokhankaplan.cinzodyaghesaplama;

import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {
        int dogumYılı, cinzodyag;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğum yılını giriniz: ");
        dogumYılı = input.nextInt();
        if (dogumYılı>2022 || dogumYılı<0) {
            System.out.println("Hatalı numara girdiniz!");
        }
        else {
            cinzodyag = dogumYılı % 12;
            System.out.println("Çin zodyağı numaranız: " + cinzodyag);
            switch (cinzodyag)
            {
                    case 1:
                    System.out.println("Horoz");
                    break;
                    case 2:
                    System.out.println("Köpek");
                    break;
                    case 3:
                    System.out.println("Köpek");
                    break;
                    case 4:
                    System.out.println("Domuz");
                    break;
                    case 5:
                    System.out.println("Fare");
                    break;
                    case 6:
                    System.out.println("öküz");
                    break;
                    case 7:
                    System.out.println("kaplan");
                    break;
                    case 8:
                    System.out.println("tavşan");
                    break;
                    case 9:
                    System.out.println("ejderha");
                    break;
                    case 10:
                    System.out.println("yılan");
                    break;
                    case 11:
                    System.out.println("at");
                    break;
                    case 12:
                    System.out.println("koyun");
                    break;
                    default:
                    System.out.println("Maymun");

        }


    }
}
}
