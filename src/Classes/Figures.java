package Classes;

import Classes.Exceptions.IncorrectFigureIndex;
import Classes.Exceptions.IncorrectFigureParams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Figures extends ArrayList<Figure> {
    @Override
    public boolean add(Figure figure){
        if (figure.isCorrect())
            return super.add(figure);
        else
            throw new IncorrectFigureParams(figure.toString());
    }
    @Override
    public Figure remove(int index){
        if (index >= 0 && index < this.size())
            return super.remove(index);
        else
            throw new IncorrectFigureIndex(index);
    }

    @Override
    public Figure get(int index) {
        if (index >= 0 && index < this.size())
            return super.get(index);
        else
            throw new IncorrectFigureIndex(index);
    }

    @Override
    public Figure set(int index, Figure element) {
        if (index >= 0 && index < this.size()) {
            if (element.isCorrect())
                return super.set(index, element);
            else
                throw new IncorrectFigureParams(element.toString());
        }
        else
            throw new IncorrectFigureIndex(index);
    }
    public void sortByArea(){
        Collections.sort(this, Comparator.comparing(Figure::getArea));
    }
    public void printAll(){
        if (this.size() == 0)
            throw new RuntimeException("Figures are missing in database!");
        else {
            for (int i = 0; i < this.size(); i++) {
                System.out.println("Figure[" + i + "] - " + get(i));
            }
        }
    }
    public void printAllInfo(){
        if (this.size() == 0)
            throw new RuntimeException("Figures are missing in database!");
        else {
            for (int i = 0; i < this.size(); i++) {
                System.out.println("Figure[" + i + "] - " + get(i).getInfo());
            }
        }
    }



}
