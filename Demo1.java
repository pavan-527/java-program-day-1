import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
            System.err.println("Even");
        else
            System.err.println("Odd"); 
    }
    
}
