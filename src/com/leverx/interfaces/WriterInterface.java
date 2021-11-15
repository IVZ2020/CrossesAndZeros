package com.leverx.interfaces;

public interface WriterInterface {

    static void writeString(String string) {
        System.out.println(string);
    }

    static void writeTwoDimensionsMatrix(String[][] matrix) {

        int matrixColumnHeight = matrix[0].length;

        for (String[] strings : matrix) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < matrixColumnHeight; j++) {
                line.append(strings[j]);
            }
            writeString(line.toString());
        }
    }
}
