public class Mazeusingvoid {

    static void getMazePos(int row, int endRow, int col, int endCol, String result) {
        if(row == endRow && col == endCol) {
            System.out.println(result);
            return;
        }
        if(row > endRow || col > endCol) {
            return;
        }
        getMazePos(row, endRow, col+1, endCol, result + "R");
        getMazePos(row + 1, endRow, col, endCol, result + "D");

    }

    public static void main(String[] args) {
        getMazePos(0, 2, 0, 2, "");
    }
}
