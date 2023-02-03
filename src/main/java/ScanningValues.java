import java.util.Scanner;


public class ScanningValues {
  public static void main(){
    Scanner sc =new Scanner(System.in);
    System.out.println("pl enter value of a");
    int a = sc.nextInt();
    System.out.println("pl enter value of b");
    int b =sc.nextInt();
    if ( a==b){
      System.out.println("a= b");

    }
    else{
      System.out.println("a and b not same");
    }


  }


}
