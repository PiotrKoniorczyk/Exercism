import java.util.ArrayList;
import java.util.List;

class Matrix {
    String[] matrixAsString_split;
    int countColumn;


    Matrix(String matrixAsString) {
        matrixAsString_split = matrixAsString.split("\n");

        countColumn = matrixAsString_split.length;
    }

    int[] getRow(int rowNumber) {

        List<Integer> rowList = new ArrayList<>();
        String[] inRow = matrixAsString_split[rowNumber - 1].split(" ");
        for (String s : inRow) {
            rowList.add(Integer.parseInt(s));
        }
        return rowList.stream().mapToInt(i -> i).toArray();
    }

    int[] getColumn(int columnNumber) {
        List<Integer> columnList = new ArrayList<>();

        for (int i = 0; i < countColumn; i++){
            String[] inRow = matrixAsString_split[i].split(" ");
            String inColumn = inRow[columnNumber-1];
            columnList.add(Integer.parseInt(inColumn));
        }
        int[] columnFinal = columnList.stream().mapToInt(i -> i).toArray();

        return columnFinal;
    }
}
