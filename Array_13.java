import java.util.ArrayList;

public class Array_13 {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(100);
        L1.add(200);
        L1.add(300);
        L1.add(400);
        L1.add(500);
        L1.add(300);

        System.out.println(L1.indexOf(400));
        System.out.println(L1.indexOf(100));
        System.out.println(L1.indexOf(120)); // not available in this list (-1)
        System.out.println(L1.indexOf(300)); // Index of 2
        System.out.println(L1.lastIndexOf(300)); // Index of 5

        for(int i=0; i<L1.size(); i++){
            
        }
    }
    
}
