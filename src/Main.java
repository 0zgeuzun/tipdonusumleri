import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan giriş alınması
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt(); // Kullanıcının girdiği tam sayı

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble(); // Kullanıcının girdiği ondalıklı sayı

        // Tip dönüşümleri
        double tamSayiDouble = (double) tamSayi; // Tam sayıyı ondalıklı sayıya dönüştürme
        int ondalikliSayiInt = (int) ondalikliSayi; // Ondalıklı sayıyı tam sayıya dönüştürme

        // Sonuçların ekrana yazdırılması
        System.out.println("Girilen tam sayı: " + tamSayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürüldü: " + tamSayiDouble);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürüldü: " + ondalikliSayiInt);

        // Scanner'ı kapatma
        scanner.close();
    }
}