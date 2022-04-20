package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    int n,r;


        System.out.println("N değerini giriniz : ");
        n = input.nextInt();

        System.out.println("R değerini giriniz : ");
        r = input.nextInt();


        int factN = 1 , factR = 1 , factNR = 1;

        if (n < r){
            System.out.println("N degeri R degerinde büyük olmalıdır!");
           
        }else {
            for (int i = 1; i <=n; i++){
                factN = factN * i;
            }

            for (int i = 1; i <=r; i++){
                factR = factR * i;
            }

            for (int i = 1; i <=(n-r); i++){
                factNR = factNR * i;
            }

            double sonuc = factN / (factR * factNR);
            System.out.println("Girilen Sayıların Kombinasyonu:" + sonuc );

        }





    }
}
