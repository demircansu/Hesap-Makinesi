
package hesap;

import java.util.Scanner;


public class Hesap {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       Calculator calculator=new Calculator();
       
        System.out.println("Birinci sayıyı girin: ");
        int num1=scanner.nextInt();
        
        System.out.println("İkinci sayıyı girin: ");
        int num2=scanner.nextInt();
        
        System.out.println("Matematiksel işlemi girin: (Toplama,Çıkarma,Çarpma,Bolme");
        String operation=scanner.next().toLowerCase();
        
        switch(operation){
            case "toplama":
                calculator.toplam(num1, num2);
                break;
            case "cıkarma":
                calculator.cıkarma(num1, num2);
                break;
            case "carpma":
                calculator.carpma(num1, num2);
                break;
            case "bolme":
                calculator.bolme(num1,num2);
                break;
            default:
                System.out.println("Geçersiz işlem..");
        }
        System.out.println(calculator.getResult());
    }
    
}
