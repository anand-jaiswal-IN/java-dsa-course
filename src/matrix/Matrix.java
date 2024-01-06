package matrix;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Matrix mat1 = new Matrix(3, 3);
        Matrix mat2 = new Matrix(3, 3);

        mat1.setMatrix(new int[][] {
                { 5, 6 , 11},
                { 1, 2 , 12},
                { 1, 2 , 12},
        });

        mat2.setMatrix(new int[][] {
                { 1, 5, 18 },
                { 5, 6, 19 },
                { 5, 6, 19 },
        });
        Matrix mat3 = mat1.mulMatrix(mat2);
        mat1.printMatrix();
        mat2.printMatrix();
        mat3.printMatrix();

    }
}

public class Matrix {

    private int[][] matrix;
    private int row, col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void setMatrixByCol(int colNumber, int[] arr) {
        if (arr.length != this.row)
            System.err.println("row is not same for this matrix");
        else {
            for (int i = 0; i < arr.length; i++) {
                this.matrix[i][colNumber - 1] = arr[i];
            }
        }
    }

    public void setMatrixByRow(int rowNuber, int[] arr) {
        if (arr.length != this.col)
            System.err.println("column is not same for this matrix");
        else {
            for (int i = 0; i < arr.length; i++) {
                this.matrix[rowNuber - 1] = arr;
            }
        }
    }

    public void setMatrix(int[][] mat) { // Two dimensional array => matrix
        if (mat.length != this.row)
            System.err.println("Row is incorrect");
        else {
            int i = 0;
            while (i < mat.length) {
                if (mat[i].length != this.col) {
                    System.err.println("Col is incorrect");
                    break;
                }
                if (i == mat.length - 1) {
                    for (int j = 0; j < this.matrix.length; j++) {
                        for (int j2 = 0; j2 < this.matrix[j].length; j2++) {
                            this.matrix[j][j2] = mat[j][j2];
                        }
                    }
                }
                i++;
            }
        }

    }

    public Matrix returnThisMatrix() {
        Matrix newMat = new Matrix(this.row, this.col);

        newMat.matrix = this.matrix;
        return newMat;
    }

    public void printMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            System.out.println(Arrays.toString(this.matrix[i]));
        }
        System.out.println();
    }

    public Matrix addMatrix(Matrix mat) {
        if (this.row == mat.row && this.col == mat.col) {
            Matrix returnMat = new Matrix(this.row, this.col);

            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    returnMat.matrix[i][j] = this.matrix[i][j] + mat.matrix[i][j];
                }
            }
            return returnMat;
        } else {
            System.err.println("Matrix dimension is incorrect");
            return new Matrix(1, 1);
        }
    }

    public Matrix subMatrix(Matrix mat) {
        if (this.row == mat.row && this.col == mat.col) {
            Matrix returnMat = new Matrix(this.row, this.col);

            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    returnMat.matrix[i][j] = this.matrix[i][j] - mat.matrix[i][j];
                }
            }
            return returnMat;
        } else {
            System.err.println("Matrix dimension is incorrect");
            return new Matrix(1, 1);
        }
    }

    public Matrix mulMatrix(Matrix mat) { // only for square matrix

        if (this.row != this.col || mat.row != mat.col) {
            System.err.println("Matrix should be square while performing multiplication of matrix");
            return new Matrix(1, 1);
        } else {

            Matrix returnMat = new Matrix(this.row, mat.col);

            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    for (int k = 0; k < mat.col; k++) {
                        returnMat.matrix[i][j] += this.matrix[i][k] * mat.matrix[k][j];
                    }
                }
            }
            return returnMat;
        }
    }

}