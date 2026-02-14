
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char alpha=sc.next().charAt(0);
        if(alpha=='a')
            System.out.println("a is a vowel");
        else if(alpha=='e')
            System.out.println("e is a vowel");
        else if(alpha=='i')
            System.out.println("i is a vowel");
        else if(alpha=='o')
            System.out.println("o is a vowel");
        else if(alpha=='u')
            System.out.println("u is a vowel");
        else
            System.out.println("the charater is a consonant");

    }
}
