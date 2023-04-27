package Classes.Exceptions;

public class IncorrectFigureIndex extends RuntimeException{
    public IncorrectFigureIndex(int index){
        super(String.format("Figure with number '%d' is not exist! Try again.", index));
    }
}
