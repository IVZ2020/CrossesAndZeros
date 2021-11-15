package com.leverx.main;

import com.leverx.dao.Dao;
import com.leverx.interfaces.GridInterface;
import com.leverx.interfaces.WriterInterface;
import com.leverx.service.Service;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();
        Dao dao = new Dao();

          service.writeTwoDimensionsGrid(dao.createEmptyGrid());
          String[][] currentMatrix = service.createCurrentMatrixFromEmptyGrid();
          currentMatrix = service.inputMovement(0,9,GridInterface.zeroMovement, currentMatrix);
          service.writeTwoDimensionsGrid(currentMatrix);
          if (service.checkIfCellIsEmpty(0,9, currentMatrix)) {
              currentMatrix = service.inputMovement(0,9,GridInterface.crossMovement, currentMatrix);
          } else {
              currentMatrix = service.inputMovement(0,5,GridInterface.crossMovement, currentMatrix);;
          }
        service.writeTwoDimensionsGrid(currentMatrix);
          currentMatrix = dao.createEmptyGrid().clone();
        service.writeTwoDimensionsGrid(currentMatrix);

    }
}
