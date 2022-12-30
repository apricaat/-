package Task19;

import java.util.Objects;

public class INN {
    String value;

    public static String isValidate(String value) {
        if (value.length() == 12 || value.length() == 10) {
            try {
                for (char digitChar : value.toCharArray()) {
                    int x = Integer.parseInt(String.valueOf(digitChar));
                }

                return value;
            } catch (Exception exception) {
                // System.out.println(exception.toString());
                return "";
            }
        }
        return "";
    }

    public static boolean isValidate(Client[] clients, Client client) {
        for(Client client1: clients){
            if (client1.equals(client)){
                return true;
            }
        }
        return false;
    }

    public INN(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Task19.INN{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof INN)) return false;
        INN inn = (INN) obj;
        return Objects.equals(getValue(), inn.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
