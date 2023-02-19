import java.util.ArrayList;

public class Array_14 {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        L1.add(100);
        L1.add(200);
        L1.add(300);
        L1.add(400);
        L1.add(500);
        L1.add(600);

       L1.set(1, 250);

        for(int i=0; i<L1.size(); i++){
            System.out.println(L1.get(i));
           
        }
    }
    
}
