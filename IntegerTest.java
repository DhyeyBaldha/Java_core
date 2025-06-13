

public class IntegerTest {
    public static void main(String [] args){
        int i = Integer.parseInt("123");
        Integer i2 = Integer.valueOf("100010",2);
        int i3 = i2.intValue();
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
    }
}
