public class TransposeOfMatrix {
    public static void main(String[] args) {
        int row =2 , col = 3;
        int[][] matrix = {{2,3,7} , {5,6,7}};

        printTranspose(matrix);

        int [][] transpose = new int[col][row];
            for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        printTranspose(transpose);


        
    }
    public static void printTranspose(int [][] matrix){
        System.out.println("the Matrix is:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}
