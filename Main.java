import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
              int a,basamak,basamakToplami=0;
              Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz :");
        a = input.nextInt();
        while (a!=0){
            basamak =a%10;
            basamakToplami+=basamak;
            a/=10;



        }
        System.out.print(basamakToplami);

        }
    }






