import java.util.*;
public class day_1_practical_1 {

    public static void main(String [] args){
        // hello world
        System.out.println("hello world");

        //list

        // ArrayList
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("dhyey");
        arr.add("harshil");
        arr.add("IntegerTest");
        arr.add("radhen");
        arr.get(1);
        arr.set(1, "vidhi");


        // normal for loop
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));

        }


        //for loop using ArrayList
        for(String i : arr){
            System.out.println(i);
        }


        //integer
        ArrayList<Integer> in = new ArrayList<Integer>();
        in.add(15);
        in.add(20);
        in.add(5);
        in.add(65);
        for(Integer i : in){
            System.out.println(i);
        }
        // short ArrayList arr
        Collections.sort(arr);
        for(String i : arr){
            System.out.println(i);
        }


        // LinkedList
        System.out.println("linked list");
        LinkedList<String> larr = new LinkedList<>();
        larr.add("dhyey");
        larr.add("harshil");
        larr.add("IntegerTest");
        larr.add("vidz");
        larr.remove(2);
        System.out.println(larr);


        // sets
        System.out.println("HASH SET");
        // hashsets
        HashSet<String> harr = new HashSet<String>();
        harr.add("dhyey");
        harr.add("harshil");
        harr.add("vidz");
        harr.add("vidz");
        System.out.println(harr);
        System.out.println(harr.contains("vidz"));

        //  Map

        // hashmap
        HashMap<Integer,String> hmap = new HashMap<Integer,String>();
        hmap.put(1,"dhyey");
        hmap.put(2,"vidz");
        hmap.put(3,"harshil");
        hmap.put(4,"IntegerTest");
        System.out.println(hmap);
        System.out.println(hmap.get(2));

        // for
        for (Integer i : hmap.keySet()){
            System.out.println(i);
        }
        for (String i : hmap.values()){
            System.out.println(i);
        }
        for (Integer i : hmap.keySet()){
            System.out.println("key:" +i+ " value:"+hmap.get(i));
        }
    }
}
