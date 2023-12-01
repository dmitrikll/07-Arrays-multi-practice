package Task02;

public class Main {

    static int[][] temperatureList;
    static final int STANDARD = 14;

    public static void main(String[] args) {

        temperatureList = new int[][]{
                {8, 12, 19},
                {13, 24, 9},
                {8, 10, 3},
                {15, 7, 29}
        };

        int count = 0;

        for (int[] day : temperatureList) {
            for (int temperature : day) {
                if (temperature < STANDARD) {
                    count += 1;
                }
            }
        }

        if (count > 0) {
            System.out.println("Number of days with temperatures below " + STANDARD + " deg: " + count);
        } else {
            System.out.println("No days with temperatures below " + STANDARD + " deg");
        }
    }
}
