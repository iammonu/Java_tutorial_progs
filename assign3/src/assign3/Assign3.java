package assign3;
import java.util.Scanner;
public class Assign3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the first no: \n");
        a=sc.nextInt();
        System.out.println("enter the second no: \n");
        b=sc.nextInt();
        if(a>b)
        System.out.println("A is bigger");
        else 
            System.out.println("B is bigger");
        
        
    }
    
}
