import java.util.Random;
import java.util.Scanner;

class Matrix {
    Scanner scanner = new Scanner(System.in);
    int x;
    int y;
    int [][] arr = new int[x][y];

    public Matrix (int x,int y, int [][] arr) {
        this.x = x;
        this.y = y;
        this.arr = arr;
    }

    public void addNumbersToMatrix (int [][] arr){
        Random randomize = new Random();
        for (int i = 0; i < x; i++) {
        for (int j = 0; j < y; j++) {
            arr[i][j] = randomize.nextInt(10);
        }
    }
    }

    public void printMatrix (int [][] arr) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void multi (int [][] arr) {
        int n = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] *= n;
            }
        }
    }
    public void sumOfMatrix (int [][] arr, int [][] arr2){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] += arr2[i][j];
            }
        }
    }

}

public class PlayWithMatrix {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        int [][] arr2 = new int [3][3];
        Matrix matrix = new Matrix(3,3, arr);
        matrix.addNumbersToMatrix(arr);
        matrix.printMatrix(arr);
        System.out.println();
        matrix.addNumbersToMatrix(arr2);
        matrix.printMatrix(arr2);
        matrix.sumOfMatrix(arr, arr2);
        System.out.println();
        matrix.printMatrix(arr);

    }
}
