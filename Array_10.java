import java.util.ArrayList;

public class Array_10 {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();

        ArrayList<Integer> L2 = new ArrayList<>(5);
        L1.add(10);
        L1.add(20);
        L1.add(30);
        L1.add(40);
        L1.add(50);

        L2.add(100);
        L2.add(200);
        L2.add(300);
        L1.addAll(L2);
        
        for(int i=0; i<L1.size(); i++){
            System.out.println(L1.get(i));
        }
    }
    
}

// ArrayList in java