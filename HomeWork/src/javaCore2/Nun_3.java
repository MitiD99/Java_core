package JavaCore2;

public class Nun_3 {
    public static void main(String[] args) {
        int[][] mat = new int[5][7];
        int min = -2;
        int max = 75;
        int range = max - min + 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                mat[i][j] = (int) (Math.random() * range) + min;
            }
        }
        for (int i = 0; i < 5; i++, System.out.println()) {
            for (int j = 0; j < 7; j++) {
                System.out.print(mat[i][j] + "  ");
            }
        }
    }
}
