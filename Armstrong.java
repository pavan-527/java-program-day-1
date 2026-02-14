import java.util.Scanner;

public class Armstrong {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int d=temp%10;
            sum=sum+d*d*d;
            temp=temp/10;
        }
        if(num==sum)
            System.out.println(sum+" is a armstrong");
        else
            System.out.println(sum+" is not a armstrong");
    }
    
}
