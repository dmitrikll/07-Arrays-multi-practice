package Task03;

public class Main {

    static String[][][][] standings;

    public static void main(String[] arg) {

        standings = new String[][][][]{
                { //day1
                        { //court1
                                {"player#1", "player#2"} //players
                        },
                        { //court2
                                {"player#3", "player#4"} //players
                        }
                },
                { //day2
                        { //court1
                                {"player#5", "player#6"} //players
                        },
                        { //court2
                                {"player#7", "player#8"} //players
                        }
                },
                { //day3
                        { //court1
                                {"player#9", "player#10"} //players
                        },
                        { //court2
                                {"player#11", "player#12"} //players
                        }
                },
        };

        int dayCount = 0;
        int courtCount;

        for (String[][][] day : standings) {

            dayCount += 1;
            courtCount = 0;
            System.out.println("Day " + dayCount + ": ");

            for (String[][] court : day) {
                courtCount += 1;
                System.out.print("Court " + courtCount + ": ");

                for (String[] players : court) {

                    for (String player : players) {
                        System.out.print(player + " ");
                    }
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}

