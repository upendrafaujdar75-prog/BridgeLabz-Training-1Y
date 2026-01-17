import java.util.Scanner;
public class IntrestCalculator {
   public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("----Simple Interest Calculator---");
        System.out.println("Enter Principal :");
        int Principal=sc.nextInt();
        System.out.println("Enter Rate Of Interest(%) :");
        int Rate=sc.nextInt();
        System.out.println("Enter Time(Years) :");
        int Time=sc.nextInt();
        System.out.println("Your Total Interest is : "+(Principal*Rate*Time));
    }
}
