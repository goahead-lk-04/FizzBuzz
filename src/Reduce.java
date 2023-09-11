public class Reduce {

    public static void main(String[] args) {

        int n = 100;
        int count = 0;

        for (int i = n; i>0; i--) {
            if (i % 2 == 0) {
                i /= 2;
                count++;
            } else {
                i-=1;
                count++;
            }
        }

        System.out.println(count);

    }
}
