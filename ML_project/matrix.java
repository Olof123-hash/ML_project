import java.util.Arrays;

public class matrix{

public int[][] matrixMultiplication(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {

if (c1 != r2) {
    System.out.println("Can not do matrix multiplication");
    return null;
}
    /// 2 X 2 X 3 X 2 
int[][] result = new int[r1][c2];

for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c2; j++) {
        for (int k = 0; k < c1; k++) {
           result[i][j] += a[i][k] * b[k][j];
        }
    }
}

System.out.println(Arrays.deepToString(result));
//loop through 

return result;

}

public int[][] matrixTranspose(int[][] a) {

int[][] result = new int[a[0].length][a.length];



return result;
}
    
public static void main(String[] args) {
int[][] a = {{3,4,5}, {5,7,5}};

int[][] b = {{4,5}, {6,7}, {6,8}};

int r1 = a.length;
int c1 = a[0].length;

int r2 = b.length;
int c2 = b[0].length;


System.out.println(Arrays.deepToString(a));
matrix obj1 = new matrix();

obj1.matrixMultiplication(a, b, r1, c1, r2, c2);

}
}