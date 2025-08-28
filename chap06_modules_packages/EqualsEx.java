class PointEq {
    int x, y;
    public PointEq(int x, int y) {
        this.x = x; this.y = y;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PointEq)) return false;
        PointEq p = (PointEq) obj;
        return x == p.x && y == p.y;
    }
}
public class EqualsEx {
    public static void main(String[] args) {
        PointEq a = new PointEq(2, 3);
        PointEq b = new PointEq(2, 3);
        PointEq c = new PointEq(3, 4);
        if (a == b) System.out.println("a==b");
        if (a.equals(b)) System.out.println("a is equal to b");
        if (a.equals(c)) System.out.println("a is equal to c");
    }
}
