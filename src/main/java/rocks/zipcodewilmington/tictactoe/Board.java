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
        return columnCheck('X');
        //if in of of X either horizontal vertical or diagnol, return true
        //import X into Checkers as (win)

    }

    public Boolean isInFavorOfO() {
        return columnCheck('O');
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
        return (win == matrix[0][0] && win == matrix[1][0] && win == matrix[2][0]);

        /*{'X', 'O', ' '},
        {'X', ' ', ' '},  <example
        {'X', 'O', ' '}*/


    }
    public boolean rowChecker(char win){
        return true;
}
    public boolean diagnolChecker(char win){
        return true;
    }
}
