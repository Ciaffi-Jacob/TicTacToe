package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
private static Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;

    }

    public Boolean isInFavorOfX() {
        return columnCheck('X') || rowChecker('X') ||diagnolChecker('X');
        //if in of of X either horizontal vertical or diagnol, return true
        //import X into Checkers as (win)

    }

    public Boolean isInFavorOfO() {
        return columnCheck('O') || rowChecker('O') || diagnolChecker('O');
        //if in of of O either horizontal vertical or diagnol, return true
    }

    public Boolean isTie() {
        return (!isInFavorOfO() && !isInFavorOfX());
        //if not in favor of x or O return true
    }

    public String getWinner() {
        //if isTie == true {return "Tie"}
        //ifFavorOfO
        //if FavorOfX
        if (isInFavorOfX()){
            return "X";
        }
        else if (isInFavorOfO()){
            return "O";
        }
        else {
            return "";
        }
    }
    public boolean columnCheck(char win){
        //return boolean
        return ((win == matrix[0][0] && win == matrix[1][0] && win == matrix[2][0])
                || (win == matrix[0][1] && win == matrix[1][1] && win == matrix[2][1])
                || (win == matrix[0][2] && win == matrix[1][2] && win == matrix[2][2]));

        /*{'X', 'O', ' '},
        {'X', ' ', ' '},  <example
        {'X', 'O', ' '}*/


    }
    public boolean rowChecker(char win){
        return ((win == matrix[0][0] && win == matrix[0][1] && win == matrix[0][2])
                || (win == matrix[1][0] && win == matrix[1][1] && win == matrix[1][2])
                || (win == matrix[2][0] && win == matrix[2][1] && win == matrix[2][2]));
}
    public boolean diagnolChecker(char win){
        return ((win == matrix[0][0] && win == matrix[1][1] && win == matrix[2][2])
                || (win == matrix[0][2] && win == matrix[1][1] && win == matrix[2][0]));
    }
}
