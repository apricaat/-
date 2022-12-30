package Task19;

import java.util.Objects;

public class Client {
    INN inn;
    String name;
    String surname;
    String patronymic;

    public Client(INN inn, String name, String surname, String patronymic) {
        this.inn = inn;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public INN getInn() {
        return inn;
    }

    public void setInn(INN inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Task19.Client{" +
                "inn=" + inn +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Client)) return false;
        Client client = (Client) obj;
        return Objects.equals(getInn(), client.getInn()) && Objects.equals(getName(), client.getName()) && Objects.equals(getSurname(), client.getSurname()) && Objects.equals(getPatronymic(), client.getPatronymic());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInn(), getName(), getSurname(), getPatronymic());
    }
}
