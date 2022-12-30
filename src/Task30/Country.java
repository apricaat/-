package Task30;

public class Country {
    public String name;
    private int square;
    private int populSize;

    public Country(String name, int square, int populSize){
        this.name=name;
        this.square=square;
        this.populSize=populSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

    public void setPopulSize(int populSize) {
        this.populSize = populSize;
    }

    public int getPopulSize() {
        return populSize;
    }

    @Override
    public String toString() {
        return "Task30.Country {" +
                "name: "+ name +
                "square: "+square+" km^2" +
                "population size: "+populSize +
                "}";
    }

    @Override
    public int hashCode() {
        return square+populSize;
    }
}
