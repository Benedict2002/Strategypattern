public abstract class IntProcessor {
 public void operateOn(int x) {
 int y = f(x);
 System.out.println(x + " becomes " + y);
 }
 protected abstract int f(int x);
}
public class AddOne extends IntProcessor {
 protected int f(int x) {
 return x+1;
 }
}
public class AddTwo extends IntProcessor {
 protected int f(int x) {
 return x+2;
 }
}
public class TestClient {
 public static void main(String[] args) {
 IntProcessor p1 = new AddOne();
 IntProcessor p2 = new AddTwo();
 p1.operateOn(6); // prints "6 becomes 7"
 p2.operateOn(6); // prints "6 becomes 8"
 }
}
