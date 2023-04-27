import Classes.*;
import Classes.Exceptions.IncorrectCommand;
import Classes.Exceptions.IncorrectFigureIndex;
import Classes.Exceptions.IncorrectFigureParams;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Figure createFigure(){
        double params[];
        System.out.println("Create figure:\n" +
                "\t1. Triangle\n" +
                "\t2. Square\n" +
                "\t3. Rectangle\n" +
                "\t4. Circle");
        String cmd = scanner.next();
        switch (cmd) {
            case "1":
                params = new double[3];
                for (int i = 0; i < params.length; i++) {
                    System.out.printf("Enter the length of %d-th side of triangle: ", i+1);
                    params[i] = scanner.nextDouble();
                }
                return new Triangle(params);
            case "2":
                System.out.print("Enter the length of side of square: ");
                return new Square(scanner.nextDouble());
            case "3":
                params = new double[2];
                for (int i = 0; i < params.length; i++) {
                    System.out.printf("Enter the length of %d-th side of rectangle: ", i+1);
                    params[i] = scanner.nextDouble();
                }
                return new Rectangle(params[0], params[1]);
            case "4":
                System.out.print("Enter the radius of circle: ");
                return new Circle(scanner.nextDouble());
            case default:
                throw new IncorrectCommand(cmd);
        }
    }
    public static void main(String[] args) {
        Figures figures = new Figures();
        figures.add(new Triangle(3.0, 4.0, 5.0));
        figures.add(new Square(7.0));
        figures.add(new Rectangle(22.0, 6.0));
        figures.add(new Circle(1.0));
        figures.printAll();
        System.out.println("------------------");
        figures.sortByArea();
        figures.printAll();

        while (true){
            System.out.println("Enter the command:\n" +
                    "\t1. Create figure\n" +
                    "\t2. Show all figures\n" +
                    "\t3. Remove figure\n" +
                    "\t4. Show all info\n" +
                    "\t5. Sort figures by area\n" +
                    "\t6. Quit");
            try {
                String cmd = scanner.next();
                switch (cmd) {
                    case "1":
                        figures.add(createFigure());
                        break;
                    case "2" :
                        figures.printAll();
                        break;
                    case "3":
                        System.out.print("Enter the number of removing figure: ");
                        figures.remove(scanner.nextInt());
                        break;
                    case "4":
                        figures.printAllInfo();
                        break;
                    case "5":
                        figures.sortByArea();
                        break;
                    case "6":
                        return;
                    case default:
                        throw new IncorrectCommand(cmd);
                }
            }
            catch (IncorrectCommand ex) {
                System.out.println(ex.getMessage());
            }
            catch (IncorrectFigureIndex ex) {
                System.out.println(ex.getMessage());
            }
            catch (IncorrectFigureParams ex) {
                System.out.println(ex.getMessage());
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

    }
}