package collectionframework;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();     // 1
        list.add("Naresh");         list.add("Anushka");
        list.add("Aisha");        list.add("Sonali");
        list.add("Aisha");          list.add("Naresh"); // 2
        System.out.println(list);       // 3

        System.out.println("First Student: " + list.get(0));  // 4
        System.out.println("Last Student: " + list.get(list.size()-1));  // 4
        list.add(2, "Anushka");       // 5
        System.out.println("New List: " + list);
        list.set(4, "Prince");          // 6
        System.out.println("Updated List: " + list);
        list.remove(4);       // 7
        System.out.println("After Removing: " + list);
        System.out.println("Rahul exists: " + list.contains("Rahul"));   // 8
        System.out.println("First Occurrence of Anushka: " + list.indexOf("Anushka"));    // 9
        System.out.println("Final List: " + list);   // 10
        System.out.println("Size: " + list.size());
        
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i) + " at index position " + i);
        }
        list.clear();
        System.out.println("Clear List: " + list);  // bonus
    }
}