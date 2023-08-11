public class MazewithDiagonal {
    static void getMazePos(int row , int col, int endRow, int endCol, String result){
        
        // Termination Case (Positive Case and Negative Case)
        // Positive Case
        if(col == endCol && row == endRow){
            System.out.println(result);
            return ;
        }
        // Negative Case
        if(col>endCol || row>endRow){
            return ;
        } 
        // Move to the Right
getMazePos(row, col+1, endRow, endCol,result+ "R");
 
        // Move to the Down
getMazePos(row+1, col, endRow, endCol,result+ "D");

        // Move to the Diagonal-----> C indicates diagonal
getMazePos(row+1, col+1, endRow, endCol,result+ "C");

    }
    public static void main(String[] args) {
 getMazePos(0, 0, 2, 2,"");
    }
}