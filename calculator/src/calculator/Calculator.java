

package calculator;
import java.util.Scanner;
public class Calculator {


    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        double fnum,snum,ans;
        System.out.println(" Enter the first no: ");
        fnum=calc.nextDouble();
        System.out.println(" Enter the second no: ");
        snum=calc.nextDouble();
        ans=fnum+snum;
        System.out.println(ans);     
        }
    
    
}
