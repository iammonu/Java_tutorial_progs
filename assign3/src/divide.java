
import java.util.Scanner;

public class divide {
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter a no: \n");
       a=sc.nextInt();
       if(a%5==0 && a%7==0)
           System.out.println("Number is divisible ");
       else
            System.out.println("Number is not divisible ");
    
}
}