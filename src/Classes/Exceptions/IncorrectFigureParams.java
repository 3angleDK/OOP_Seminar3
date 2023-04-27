package Classes.Exceptions;

public class IncorrectFigureParams extends RuntimeException{
    public IncorrectFigureParams(String info){
        super("Incorrect parameters of figure!\n" +
                String.format("Figure: '%s' can't exists!", info));
    }
}
