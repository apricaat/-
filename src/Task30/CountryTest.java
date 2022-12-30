package Task30;

import org.junit.*;

import java.util.ArrayList;

public class CountryTest {

    @Test
    public void testToString() {
        Country c1 = new Country("Russia",17100000,145478097);
        Country c2 = new Country("USA", 9800000, 301693000);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Task30.Country {" +
                "name: Russia" +
                "square: 17100000 km^2" +
                "population size: 145478097" +
                "}");
        expected.add("Task30.Country {" +
                "name: USA" +
                "square: 9800000 km^2" +
                "population size: 301693000" +
                "}");
        ArrayList<String> actual = new ArrayList<>();
        actual.add(c1.toString());
        actual.add(c2.toString());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        Country c1 = new Country("Russia",17100000,145478097);
        Country c2 = new Country("USA", 9800000, 301693000);
        ArrayList<Boolean> actual = new ArrayList<>();
        actual.add(c1.hashCode() == c2.hashCode());
        ArrayList<Boolean> expected = new ArrayList<>();
        expected.add(false);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notPass(){
        Country c1 = new Country("Russia",17100000,145478097);
        int expected = 228;
        int actual = c1.getSquare();
        Assert.assertEquals(expected, actual);
    }
}
