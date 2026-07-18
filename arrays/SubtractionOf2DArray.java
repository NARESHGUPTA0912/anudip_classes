public class SubtractionOf2DArray {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        int rows = a.length,  cols = a[0].length;
        int[][] difference = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                difference[i][j] = a[i][j] - b[i][j];

        System.out.println("Difference of the two 2 dimensionalarrays are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(Math.abs(difference[i][j]) + " ");
            System.out.println();
        }
    }
}
