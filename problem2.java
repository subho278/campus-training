public final class problem2 {
public static void main(String[] args) {
System.out.println(new problem2().run());
}
public String run() {
int sum = 0;
for (int i = 0; ; i++) {
int fib = fibonacci(i);
if (fib > 4000000)
break;
if (fib % 2 == 0)
sum += fib;
}
return Integer.toString(sum);
}
private static int fibonacci(int x) {
int a = 0;
int b = 1;
for (int i = 0; i < x; i++) {
int c = a + b;
a = b;
b = c;
}
return a;
}
}
