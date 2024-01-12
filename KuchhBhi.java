
public class KuchhBhi {

    public static void main(String[] args) {
        int a = 654;
        int i = 2;

        while (i < a) {
            if (a % i == 0)
                a = a / i;
            else
                i++;
        }
        System.out.println(a);
    }
}
