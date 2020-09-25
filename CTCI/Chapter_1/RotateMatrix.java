public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1 ,2 ,3 },
                                     {4 ,5 ,6 },
                                     {7 ,8 ,9 }};
        matrix = makeMatrixRotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int[][] makeMatrixRotate(int[][] matrix){
        if(matrix.length == 0 || matrix.length != matrix[0].length) return new int[0][0];
        int n = matrix.length;
        for (int i = 0; i < n/2; i++) {
            int first = i;
            int last = n - 1 - i;
            for (int j = first; j < last; j++) {
                int offset = j - first;
                int top = matrix[first][j];

                matrix[first][j] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[j][last];
                matrix[j][last] = top;
            }
        }
        return matrix;
    }
}