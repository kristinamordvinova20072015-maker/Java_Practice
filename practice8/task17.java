package practice8;
import java.util.*;

public class task17 {
    private static final Scanner in = new Scanner(System.in);

    private static int recMax() {
        int x = in.nextInt();
        if (x == 0) return Integer.MIN_VALUE;
        return Math.max(x, recMax());
    }
    public static void main(String[] args) {
        int ans =recMax();
        System.out.println(ans);
    }
}
