import java.util.ArrayList;

public class Array_11 {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(10);
        L1.add(20);
        L1.add(30);
        L1.add(40);
        L1.add(50);
        L1.clear(); // Remove all the elements from this list

        for(int i=0; i<L1.size(); i++){
            System.out.println(L1.get(i));
        }
    }
    
}
