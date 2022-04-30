package HomeWork_5;

public class Arifmetik_example {
    public static void main(String[] args) {

        int a = 10;
        int b = 7;
        int c = a + b;  // 17
        int d = 4 + b;  // 11

        int f = a - b;  // 3
        int g = 4 - a;  // -6

        int q = a * b;  // 70
        int w = b * 5;  // 35

        int e = a / b;  // 4
        double r = 22.5 / 4.5;  // 5.0

        double k = 10 / 4;     // 2
        System.out.println(k);

        double t = 10.0 / 4;     // 2.5
        System.out.println(t);

        int y = a % b;  // 3
        int u = 22 % 4; // 2 (22 - 4*5 = 2)

        int i = 8;
        int o = ++i;
        System.out.println(i);  // 9
        System.out.println(o);  // 9

        int p = 8;
        int s = p++;
        System.out.println(p);  // 9
        System.out.println(s);  // 8

        int h = 8;
        int j = --h;
        System.out.println(h);  // 7
        System.out.println(j);  // 7

        int l = 8;
        int m = l--;
        System.out.println(l);  // 7
        System.out.println(m);  // 8

        int v = a + 5 * ++b;
        System.out.println(v);  // 48

        int n = (a + 5) * ++b;
        System.out.println(n);  // 104

        int x = 10 / 5 * 2;

        double z = 2.0 - 1.1;
        System.out.println(z);

    }
}
