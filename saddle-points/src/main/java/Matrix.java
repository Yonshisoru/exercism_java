import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
    List<List<Integer>> value;
    Matrix(List<List<Integer>> values) {
        this.value = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> result = new HashSet<>();
        if(value.isEmpty()) return result;
        int rows =value.size(),cols=value.get(0).size();
        int[] maxrow = new int[rows], mincol = new int[cols];
        for (int i=0; i<cols; i++) mincol[i] = value.get(0).get(i);
        for (int i=0; i<rows; i++) {
            maxrow[i] = value.get(i).get(0);
            for (int j = 0; j < cols; j++) {
                if (value.get(i).get(j) > maxrow[i])
                    maxrow[i] = value.get(i).get(j);
                if (value.get(i).get(j) < mincol[j])
                    mincol[j] = value.get(i).get(j);
            }
        }
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                if (value.get(i).get(j) == maxrow[i] && value.get(i).get(j) == mincol[j])
                    result.add(new MatrixCoordinate(i+1,j+1));
                return result;

    }
}
