public class ShipsCounter {
    static int[][] ships = {
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 0, 0, 0,},
            {0, 1, 0, 1, 1, 0, 0, 1, 1, 1,},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 1, 1, 0, 1, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 1, 0, 0,},
            {1, 1, 0, 0, 0, 0, 0, 0, 0, 1,}
    };

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < ships.length; i++) {
            for (int j = 0; j < ships[i].length; j++) {
                if (ships[i][j] == 1) {
                    if ((i == 0 || ships[i - 1][j] == 0) && (j == 0 || ships[i][j - 1] == 0)) {
                        count++;
                    }
                }
            }

        }
        System.out.println(count);
    }

}

