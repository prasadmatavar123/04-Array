import java.util.ArrayList;

public class Array_12 {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(100);
        L1.add(200);
        L1.add(300);
        L1.add(400);
        L1.add(500);
        
        System.out.println(L1.contains(400)); //400 are available in list (True)
        System.out.println(L1.contains(600)); // 600 are no avilable in this list (Flase)
    }
    
}
