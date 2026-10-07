import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<Integer> randList(int size, int p, int val) {
        Random generator = new Random();    // Attention : pseudoRandom !
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; ++i) {
            if (p >= 0 && p <= 100) {
                int rdValue = generator.nextInt(100);
                if (rdValue <= p) {
                    list.add(val);
                }
                else {
                    list.add(rdValue);
                }
            }
        }
        return list;
    }

    public static void displayList(List<Integer> list) {
        for (int elem : list) {
            System.out.print(elem + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list1 = randList(20, 60, 4);
        displayList(list1);
        List<Integer> list2 = randList(20, 0, 4);
        displayList(list2);
        List<Integer> list3 = randList(20, 100, 4);
        displayList(list3);
    }
}
