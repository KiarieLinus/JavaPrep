package dev.kiarielinus.javaprep.arrays_strings.rotate_matrix;


import java.util.Arrays;

//Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
//        bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
public class RotateMatrix {

    static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int last = n - 1 - layer;
            for (int i = layer; i < last; i++) {
                int offset = i - layer;
                int top = matrix[layer][i]; // save top
                // left -> top
                matrix[layer][i] = matrix[last - offset][layer];
                // bottom -> left
                matrix[last - offset][layer] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top; // right<- saved top
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 4, 5}, {3, 4, 8, 9}, {7, 6, 2, 5}, {0, 2, 3, 1}};
        System.out.println(rotate(matrix));
        //Output:
        //[[0, 7, 3, 1], [2, 6, 4, 2], [3, 2, 8, 4], [1, 5, 9, 5]]
        //true
    }
}

