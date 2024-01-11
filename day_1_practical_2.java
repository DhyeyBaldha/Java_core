import java.util.*;
public class day_1_practical_2 {
    public static void main(String [] args){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<6;i++) {
            a1.add(sc.nextInt());
        }
        System.out.println(a1);
        System.out.println(a1.size());
        for (int i=1;i<a1.size();i++){
            for (int j=0;j<a1.size()-1;j++){
                if (a1.get(j)>a1.get(j+1)){
                    int f=a1.get(j);
                    a1.set(j ,a1.get(j+1));
                    a1.set(j+1 ,f);
                }
            }
        }
        System.out.println(a1);
    }

}
