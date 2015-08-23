import java.util.Random;

public class Main {
    public static void main(String[] args) {

        final int SIZE = 12;

        Random random = new Random();

        String text1 = new String("sdf sadf skjadf ;lasjkdf klsad;f jslakjf l;askdjf l;ksadjf l;kasdjf l;sadjf l;asjfd l;sajdf;l jasdf;l jasd;lkfj l;asfj");
        String text2 = new String("sdf sadf skjadf ;lasjkdf klsad;f jslakjf l;askdjf l;ksadjf l;kasdjf l;sadjf l;asjfd l;sajdf;l jasdf;l jasd;lkfj l;asfj");

        if (text1.equals(text2)) System.out.println("YES");

        System.out.println();


        int countNumb = 0;
        int count = 0;
        int[] numbs = new int[SIZE];
        long startTime = System.currentTimeMillis();

        while (count < numbs.length) {
            int numb = (int) (Math.random() * 21) - 10;
            if (numb != 0) {
                numbs[count] = numb;
                count++;
            }
        }

        while (countNumb != 6) {
            for (int i = 0; i < numbs.length; i++) {
                numbs[i] = Math.abs(numbs[i]);
                if (!random.nextBoolean())
                    numbs[i] *= -1;
            }
            countNumb = 0;
            for (int numb : numbs) {
                if (numb > 0)
                    countNumb++;
            }
        }

        for (int numb : numbs)
            System.out.println(numb);

        System.out.println("\n" + (System.currentTimeMillis() - startTime));


    }
}
