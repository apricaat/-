public abstract class Dog {

    private String name;
    private String gender;

    public Dog(String nm, String gen){
        this.name=nm;
        this.gender=gen;
    }
    public abstract void size();

    @Override
    public String toString(){
        return "Имя: " + this.name + "Пол: " + this.gender;
    }

}
