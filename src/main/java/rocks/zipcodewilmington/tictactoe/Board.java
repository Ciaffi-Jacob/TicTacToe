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

        //if in of of X either horizontal vertical or diagnol, return true
        //import X into Checkers as (win)
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
        //if in of of O either horizontal vertical or diagnol, return true
    }

    public Boolean isTie() {
        return null;
        //if not in favor of x or O return true
    }

    public String getWinner() {
        //if isTie == true {return "Tie"}
        //ifFavorOfO
        //if FavorOfX
        return null;
    }
    public boolean verticalCheck(char win){
        //return boolean

        //
        return true;
    }
    public boolean horizontalChecker(char win){
        return true;
}
    public boolean diagnolChecker(char win){
        return true;
    }
}
