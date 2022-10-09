//import prac1.Figure;

public class Figura{
    public static void main(String[] args){
        Figure Circle = new Figure("круг");
        System.out.println("тест метода toString "+Circle.toString());
    }
}
class Figure {
    private String name;
    Figure(String name){
        this.name=name;
        System.out.println("Данная фигура создана " + this.name);
    }
    public String toString(){
        return "Shape: " + this.name;
    }
}

