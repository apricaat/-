public class Ball {
    public static void main(String[] args){
        miatch ball = new miatch(4,"red");
        ball.display_info();

    }
}
class miatch{
    int radius;
    private String name;
    int diametr;
    miatch(int radius,String name){
        this.name=name;
        this.radius=radius;
        this.diametr=2*this.radius;
        System.out.println("Обьект мяч создан");
    }
    void display_info(){
        System.out.printf("Радиус: "+this.radius+" "+ "Диаметр: "+this.diametr + " " + "Цвет"+" "+this.name);
    }
}
