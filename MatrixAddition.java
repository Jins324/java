public class MatrixAddition {
    
    static int[][] addMatrices(int[][] A, int[][] B, int r, int c) {
        int[][] sum = new int[r][c];  
        System.out.println("Sum of matrices:");

        
        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j < c; j++) {
                
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println(); 
        }

        return sum; 
    }

    public static void main(String[] args) {
        
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int r = 3; 
        int c = 3; 

        
        int[][] result = addMatrices(A, B, r, c);

        
        System.out.println("\nThe result matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
