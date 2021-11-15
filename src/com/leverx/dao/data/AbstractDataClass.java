package com.leverx.dao.data;

public class AbstractDataClass {
    private final String[][] emptyGrid = {
            {"\u0020", "\u0020", "\u0020", "\u2502", "\u0020", "\u0020", "\u0020", "\u2502", "\u0020", "\u0020", "\u0020"},
            {"\u2500", "\u2500", "\u2500", "\u253c", "\u2500", "\u2500", "\u2500", "\u253c", "\u2500", "\u2500", "\u2500"},
            {"\u0020", "\u0020", "\u0020", "\u2502", "\u0020", "\u0020", "\u0020", "\u2502", "\u0020", "\u0020", "\u0020"},
            {"\u2500", "\u2500", "\u2500", "\u253c", "\u2500", "\u2500", "\u2500", "\u253c", "\u2500", "\u2500", "\u2500"},
            {"\u0020", "\u0020", "\u0020", "\u2502", "\u0020", "\u0020", "\u0020", "\u2502", "\u0020", "\u0020", "\u0020"}};

    private final String emptyCell = "\u0020";
    private final String crossMovement = "\u2717";
    private final String zeroMovement = "\u25ef";

    public String[][] getEmptyGrid() {
        return emptyGrid;
    }

    public String getCrossMovement() {
        return crossMovement;
    }

    public String getZeroMovement() {
        return zeroMovement;
    }

    public String getEmptyCell() {
        return emptyCell;
    }
}
