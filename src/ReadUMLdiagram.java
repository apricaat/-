public class ReadUMLdiagram{
        public static void main(String[] args){
                Circle circle = new Circle(4,"черный");
                System.out.println(circle);

                Rectangle rectangle=new Rectangle(11,10,"черный");
                //System.out.println("Площадь треугольника "+rectangle.square());
                System.out.println(rectangle);

                Square square = new Square();

        }
}
abstract class Shape{
        private String colour;
        Shape(){
                System.out.println("Обьект Shape создан");
        }
        Shape(String colour){
                this.colour=colour;
                System.out.println("Обьект shape был создан");
        }
        String getColour(){
                return this.colour;
        }
        void setColour(String colour){
                this.colour=colour;
                System.out.println("Цвет shape "+this.colour);
        }
        double square(){
                return 0.0;
        }
        public String toString(){
                return "Обьект фигура "+"цвет "+this.colour;
        }

}
class Circle extends Shape {
        protected double radius;

        Circle(double radius, String colour) {
                super.setColour(colour);
                this.radius = radius;
                System.out.println("Обьект окружность создан");
        }

        double getRadius() {
                return this.radius;
        }

        @Override
        public String toString() {
                System.out.println(super.toString());
                return "radius " + this.radius;
        }
}
class Rectangle extends Shape{
        protected double height;
        protected double length;
        Rectangle(double height,double length,String colour){
                super.setColour("розовый");
                this.height=height;
                this.length=length;
                System.out.println("Обьект треугольник создан");
        }
        double getHeight(){
                return this.height;
        }
        double getLength(){
                return this.length;
        }
        @Override
        public String toString(){
                System.out.println(super.toString());
                return "height "+this.height+" length "+this.length;
        }
}
class Square{
        Square(){
                System.out.println("Обьект площадь создан");
        }
}
