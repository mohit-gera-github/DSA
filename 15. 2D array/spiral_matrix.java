public class spiral_matrix {

    public static void printSpiral(int Matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = Matrix.length - 1;
        int endCol = Matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(Matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");
            }

            // bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(Matrix[endRow][i] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(Matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++ ;
            endCol--;
            endRow--;

        }
        System.out.println();
    
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }

}
