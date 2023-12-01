package Task01;

public class Main {

    static String[][] orderList;

    public static void main(String[] args) {

        orderList = new String[][]{
                {"apple", "mango", "kiwi"},
                {"potato", "tomato", "carrot", "cucumber"},
                {"sugar", "salt"}
        };

        System.out.println("Order list: ");

        int count = 0;

        for (int i = 0; i < orderList.length; i += 1) {
            count += 1;
            System.out.print("Order #" + count + ": ");

            for (int j = 0; j < orderList[i].length; j += 1) {
                System.out.print(orderList[i][j] + " ");
            }
            System.out.println();
        }
    }
}
