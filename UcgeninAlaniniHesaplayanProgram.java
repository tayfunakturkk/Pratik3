package Pratik3;

import java.util.Scanner;

public class UcgeninAlaniniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1, kenar2, kenar3;
        System.out.print("1.Kenar Uzunlugunu Giriniz:");
        kenar1 = input.nextInt();

        System.out.print("2.Kenar Uzunluğunu Giriniz:");
        kenar2 = input.nextInt();

        System.out.print("3.Kenar Uzunluğunu Giriniz:");
        kenar3 = input.nextInt();

        double cevre = (kenar1 + kenar2 + kenar3);
        double u = cevre / 2;
        double a = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        double Alan = Math.sqrt(a);

        System.out.println("Üçgenin Alanı:" + Alan);
    }
}