
package hesap;

public class Calculator {
    private String result;
    
   public int toplam(int num1,int num2){
       int sum=num1+num2;
       setResult("Toplama",sum);
       return sum;
   }

   protected int cıkarma(int num1,int num2){
       int difference=num1-num2;
       setResult("Çıkarma ",difference);
       return difference;
   }
   
   int carpma(int num1,int num2){
       int product=num1*num2;
       setResult("Çarpma ",product);
       return product;
   }
   
   double bolme(double num1,double num2){
       if(num2!=0){
           double quotient=num1/num2;
           setResult("Bölme: ",quotient);
           return quotient;
       }else{
           System.out.println("Bir sayı sıfıra bölünemez.");
           return Double.NaN;
       }
   }
   
    private void setResult(String operation, double resultValue) {
       result = "Sonuç (" + operation + "): " + resultValue;
    }
public String getResult(){
    return result;
}
   
    
    }

