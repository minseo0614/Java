import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요 >> ");
            a.add(scanner.next());
        }
        for (int i = 0; i < a.size(); i++) System.out.print(a.get(i) + " ");
        System.out.println();
        int longestIndex = 0;
        for (int i = 1; i < a.size(); i++) if (a.get(longestIndex).length() < a.get(i).length()) longestIndex = i;
        System.out.println("가장 긴 이름은 : " + a.get(longestIndex));
        scanner.close();
    }
}
