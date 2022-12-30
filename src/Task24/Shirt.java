package Task24;

public class Shirt {
    private String article, fullName, color, size;

    public Shirt(String stringToParse){
        String[] s = stringToParse.split(",");
        article = s[0];
        fullName = s[1];
        color = s[2];
        size = s[3];
    }

    @Override
    public String toString() {
        return "Task24.Shirt:\n" +
                "\tarticle='" + article + '\'' +
                "\n\tfullName='" + fullName + '\'' +
                "\n\tcolor='" + color + '\'' +
                "\n\tsize='" + size + '\'';
    }

    public static void main(String[] args) {
        String[] strs = new String[]{
                "S001,Black Polo Task24.Shirt,Black,XL",
                "S002,Black Polo Task24.Shirt,Black,L",
                "S003,Blue Polo Task24.Shirt,Blue,XL",
                "S004,Blue Polo Task24.Shirt,Blue,M",
                "S005,Tan Polo Task24.Shirt,Tan,XL",
                "S006,Black T-Task24.Shirt,Black,XL",
                "S007,White T-Task24.Shirt,White,XL",
                "S008,White T-Task24.Shirt,White,L",
                "S009,Green T-Task24.Shirt,Green,S",
                "S010,Orange T-Task24.Shirt,Orange,S",
                "S011,Maroon Polo Task24.Shirt,Maroon,S"
        };
        Shirt[] shirts = new Shirt[strs.length];
        for (int i = 0; i < strs.length; i++) {
            shirts[i] = new Shirt(strs[i]);
            System.out.println(shirts[i]);
        }
    }
}
