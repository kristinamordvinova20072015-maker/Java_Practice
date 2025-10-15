package practice8;
import java.util.*;

public class task16 {
         private final Scanner in = new Scanner(System.in);

         private static class Result {
             int max;
             int count;
             Result(int max, int count){
                 this.max = max;
                 this.count = count;
             }
         }
         private Result rec() {
             int x = in.nextInt();
             if (x == 0) {
                 return new Result(Integer.MIN_VALUE, 0);
             }
             Result next = rec();
             if (x > next.max) {
                 return new Result(x, 1);
             } else if (x == next.max) {
                 return new Result(next.max, next.count + 1);
             } else {
                 return next;
             }
         }

         public static void main(String[] args) {
             task16 solver = new task16();
             Result result = solver.rec();
             System.out.println(result.count);
    }

}