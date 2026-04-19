public class SumOfRow {
   

    
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9}, {11,4,3},{2,2,3}};
        int sum =0;

        for(int i=0;i<matrix[0].length;i++){
            sum += matrix[i][1];
        }
        System.out.println("sum is : " + sum);
    }
}
