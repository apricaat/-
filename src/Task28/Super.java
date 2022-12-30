package Task28;

public class Super {
    String model;
    Type type;
    int year;
    int price;
    public Car(String model, Type type, int year, int price){
        this.model=model;
        this.type=type;
        this.year=year;
        this.price=price;
    }
    private static class Type{
        String type;
        int maxSpeed;
        public Type(String type, int maxSpeed){
            this.type=type;
            this.maxSpeed=maxSpeed;
        }
    }
    public void data(){
        System.out.println("Авто: "+ model + " "+ type.type+" "+type.maxSpeed +" km/h "+year+" "+price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Nissan", new Type("crossover",180),2011,900000);
        Car car2 = new Car("Tesla", new Type("sedan",250),2020,7000000){
            public void data(){
                System.out.println("Авто == "+ model + " == "+ type.type+" == "+type.maxSpeed +" km/h == "+year+" == "+price);
            }
        };
        car1.data();
        System.out.println();
        car2.data();
    }
}
