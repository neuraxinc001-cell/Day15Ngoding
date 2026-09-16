import java.util.Scanner;
public class day15 {

    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);

        System.out.print("Angka pertama : ");
        int a = i.nextInt();

        System.out.print("Angka kedua : ");
        int b = i.nextInt();

        System.out.printf("Untuk Perkalian (*) hasil nya : %d", a*b);
        System.out.printf("%nUntuk Pembagian (/) hasil nya : %d", a/b);
    }
}
