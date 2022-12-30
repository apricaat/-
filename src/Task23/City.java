package Task23;

import java.util.Objects;

public class City {
    String city;
    String country;

    public City(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return Objects.equals(getCity(), city1.getCity()) && Objects.equals(getCountry(), city1.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getCountry());
    }

    @Override
    public String toString() {
        return "Task23.Task27.City{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
