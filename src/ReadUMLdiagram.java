public class ReadUMLdiagram {
        public static void main(String[] args) {
                Shape s1 = new Circle(4, "RED", false);
                System.out.println(s1);
                System.out.println(s1.getArea());
                System.out.println(s1.getPerimeter());
                System.out.println(s1.getColor());
                System.out.println(s1.isFilled());
                // Ошибка: у класса Shape нет метода getRadius()
                //System.out.println(s1.getRadius());
                Circle c1 = (Circle)s1;
                System.out.println(c1);
                System.out.println(c1.getArea());
                System.out.println(c1.getPerimeter());
                System.out.println(c1.getColor());
                System.out.println(c1.isFilled());
                // у класса Circle есть метод getRadius()
                System.out.println(c1.getRadius());
                // Ошибка: нельзя создать экземпляр абстрактного класса
                //Shape s2 = new Shape();
                Shape s3 = new Rectangle(2.0, 2.0, "Yellow", false);
                System.out.println(s3);
                System.out.println(s3.getArea());
                System.out.println(s3.getPerimeter());
                System.out.println(s3.getColor());
                // Ошибка: у класса Shape не метода getLength()
                //System.out.println(s3.getLength());
                Rectangle r1 = (Rectangle)s3;
                System.out.println(r1);
                System.out.println(r1.getArea());
                System.out.println(r1.getColor());
                // у класса Rectangle есть метод getLength()
                System.out.println(r1.getLength());
                Shape s4 = new Square(6.6);
                System.out.println(s4);
                System.out.println(s4.getArea());
                System.out.println(s4.getColor());
                // Ошибка: у класса Shape нет метода getSide()
                //System.out.println(s4.getSide());
                Rectangle r2 = (Rectangle)s4;
                System.out.println(r2);
                System.out.println(r2.getArea());
                System.out.println(r2.getColor());
                // Ошибка: у класса Rectangle тоже нет метода getSide()
                //System.out.println(r2.getSide());
                System.out.println(r2.getLength());
                Square sq1 = (Square)r2;
                System.out.println(sq1);
                System.out.println(sq1.getArea());
                System.out.println(sq1.getColor());
                // у класса Square есть метод getSide()
                System.out.println(sq1.getSide());
                System.out.println(sq1.getLength());
        }
}








