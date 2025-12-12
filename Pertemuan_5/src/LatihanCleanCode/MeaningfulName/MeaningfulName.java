package LatihanCleanCode.MeaningfulName;

import java.util.ArrayList;
import java.util.List;

public class MeaningfulName {
    public final static int STATUS_VALUE = 0;
    public final static int FLAGGED = 4;
    int[][] gameBoard;
    int[][] theList;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();

        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }

    /*
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
    */
}
