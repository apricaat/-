

public class CircleTest{
    public static void main(String[] args){
        Circle circle = new Circle(4);
        double diametr=8;
        System.out.println("Диаметр окружности: "+diametr);
        System.out.println(circle.toString()+" Площадь окружности "+String.format("%.3f",circle.square()));
        circle.setradius(132);
        System.out.println(circle.toString()+" Площадь окружности "+String.format("%.3f",circle.square()));
    }
}
class Circle{
    double radius;
    double diametr;
    Circle(double radius){
        this.radius=radius;
        this.diametr=this.radius*2;
        System.out.println("Обьект окружность создан");
    }
    double getradius(){
        return this.radius;
    }
    void setradius(double radius){
        this.radius=radius;
        this.diametr=this.radius*2;
        System.out.println("Радиус окружности "+this.radius+" "+"Диаметр окружности "+this.diametr);

    }
    double square(){
        return Math.PI*this.radius*this.radius;
    }
    public String toString(){
        return "Радиус окружности: "+this.radius;
    }
}


