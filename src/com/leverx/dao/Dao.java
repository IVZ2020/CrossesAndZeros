package com.leverx.dao;

import com.leverx.dao.data.AbstractDataClass;
import com.leverx.interfaces.GridInterface;
import com.leverx.interfaces.GridManipulations;

public class Dao extends AbstractDataClass {



        public String[][] createEmptyGrid() {
        return getEmptyGrid();
    }

    public boolean checkIfCellIsEmpty (int coordinateX, int coordinateY, String[][] currentMatrix) {
        String checkingCell = currentMatrix[coordinateX][coordinateY];
        return (checkingCell.equals(getEmptyCell()));
    }

    public void inputMovement(int coordinateX, int coordinateY, String typeOfMovement, String[][] currentMatrix) {
        currentMatrix[coordinateX][coordinateY] = typeOfMovement;
    }
}