
public class day_3_practical_1 {
    public static void main(String[] args) {
        String s ="peep";
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
}
