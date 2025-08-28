import java.util.Scanner;
public class RectangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.width = scanner.nextInt();
        r.height = scanner.nextInt();
        System.out.println("사각형의 면적은 " + r.getArea());
        scanner.close();
    }
}
