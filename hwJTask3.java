package java_hw3;
import java.util.*;

public class hwJTask3{
    public static void main(String[] args) {
        hwJTask3 tk = new hwJTask3();
        List<Integer> ArrayList = new ArrayList<>();
        List<Integer> LinkedList = new LinkedList<>();
        tk.getTimeMsOfInsert(ArrayList);
        tk.getTimeMsOfInsert(LinkedList);
        tk.getTimeMsOfGet(ArrayList);
        tk.getTimeMsOfGet(LinkedList);
    }

    public void getTimeMsOfInsert(List<Integer> someList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            someList.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(String.format("Insert для %s %d миллисекунд(ы)", someList.getClass(), finish - start));
    }

    public void getTimeMsOfGet(List<Integer> someList) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < someList.size(); i++) {
            someList.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(String.format("get для %s %d миллисекунд(ы)", someList.getClass(), finish - start));
    }
}
