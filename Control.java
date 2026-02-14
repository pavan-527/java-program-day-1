import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0)
            System.out.println("Zero");
        else if(a>0)
            System.out.println("positive");
        else
            System.out.println("negative");


    }
}
