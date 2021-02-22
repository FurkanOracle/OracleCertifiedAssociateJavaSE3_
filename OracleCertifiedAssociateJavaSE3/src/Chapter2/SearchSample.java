package Chapter2;

public class SearchSample {


    public static void main(String[] args) {
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + positionX + "," + positionY + ")");
        }

        class SwitchSample {
            public void main(String[] args) {
                FIRST_CHAR_LOOP:
                for (int a = 1; a <= 4; a++) {
                    for (char x = 'a'; x <= 'c'; x++) {
                        if (a == 2 || x == 'b')
                            continue FIRST_CHAR_LOOP;
                        System.out.print(" " + a + x);
                    }
                }
            }
        }

    }


}


