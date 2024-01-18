import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int num = input.nextInt();

        // Ensure that there is at least one input before comparing
        if (num > 0) {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();

            // Initialize big and small with the first input
            int big = n;
            int small = n;

            for (int i = 1; i < num; i++) {
                System.out.print("Sayı giriniz: ");
                n = input.nextInt();

                if (n > big) {
                    big = n;
                }
                if (n < small) {
                    small = n;
                }
            }
            System.out.println("En büyük sayı: " + big);
            System.out.println("En küçük sayı: " + small);
        } else {
            System.out.println("Lütfen en az bir sayı giriniz.");
        }
    }
}
