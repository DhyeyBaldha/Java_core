
import java.util.Scanner;

public class day_3_practical_2 {
    static void palindrome(String s){
        String a = "";
        for (int i=0;i<s.length();i++){
            a=s.charAt(i)+a;
        }
        if (s.equals(a)){
            System.out.println("this string is palindrome");
        }
        else{
            System.out.println("this string is not palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of strings you want to enter: ");
        String[] string = new String [sc.nextInt()];

        sc.nextLine();
        for (int i = 0; i < string.length; i++)
        {
            string[i] = sc.nextLine();
        }
        System.out.println("\nYou have entered: ");
        for(String str: string)
        {
            palindrome(str);
        }

    }

}
