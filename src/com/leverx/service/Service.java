package com.leverx.service;

import com.leverx.dao.Dao;
import com.leverx.interfaces.GridInterface;
import com.leverx.interfaces.WriterInterface;

public class Service {

    Dao dao = new Dao();

    public void writeTwoDimensionsGrid (String[][] matrix) {
        WriterInterface.writeTwoDimensionsMatrix(matrix);
    }

    public String[][] createCurrentMatrixFromEmptyGrid () {
        return dao.getEmptyGrid();
    }

    public boolean checkIfCellIsEmpty (int coordinateX, int coordinateY, String[][] currentMatrix) {
        return dao.checkIfCellIsEmpty(coordinateX, coordinateY, currentMatrix);
    }

    public String[][] inputMovement(int coordinateX, int coordinateY, String typeOfMovement, String[][] matrix) {
        matrix[coordinateX][coordinateY] = typeOfMovement;
        return matrix;
    }
}