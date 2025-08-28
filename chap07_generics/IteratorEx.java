import java.util.Iterator;
import java.util.Vector;
public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) System.out.println(it.next());
        int sum = 0;
        it = v.iterator();
        while (it.hasNext()) sum += it.next();
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}
