import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(5);

        list.add(4);
        list.add(6);
        list.add(31);
        list.add(23);
        list.add(54);
        list.add(67);

        System.out.println(list);
        list.remove(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
