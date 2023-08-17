import java.util.Scanner;

public class KullaniciGiris {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz: ");
        String username = scanner.nextLine();

        System.out.println("Parolanizi Giriniz: ");
        String password = scanner.nextLine();

        if (username.equals("kelimeme1905") && password.equals("malatya2001")) {
            System.out.println("Giris Yaptiniz!!!");
        } else {
            System.out.println("Bilgilerinizi yanlis girdiniz!!!!");
            System.out.println("Sifre Sifirlama Icin 1 \nCikis Icin 2");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            switch (choice) {
                case 1:
                    System.out.println("Lutfen yeni sifrenizi giriniz: ");
                    String newPass = scanner.nextLine();

                    if (newPass.length() >= 8) {
                        password = newPass;
                        System.out.println("Sifreniz basariyla degistirildi.");
                    } else {
                        System.out.println("Yeni sifre en az 8 karakter uzunlugunda olmalidir.");
                    }
                    break;

                case 2:
                    System.out.println("Cikis yapiliyor...");
                    // Burada çıkış işlemlerini yapabilirsiniz.
                    break;

                default:
                    System.out.println("Gecersiz secim!");
                    break;
            }
        }
    }
}

