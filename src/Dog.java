import java.util.*;

public class Dog {
    public static void main(String[] args){
    Sobaka sobaka = new Sobaka("Собака",4);
    sobaka.age(3);
    System.out.println(sobaka);
    Sobaka dogs[]={new Sobaka("Собака1",10), new Sobaka("Собака2",7)};
    Pitomniksobak pitomniksobak = new Pitomniksobak();
    System.out.println(pitomniksobak);
    pitomniksobak.adddog(sobaka);
    System.out.println(pitomniksobak);
    pitomniksobak.adddogs(dogs);
    System.out.println(pitomniksobak);

    }
}
class Sobaka{
    private String name;
    private int ages;
    Sobaka(String name,Integer ages){
        this.name=name;
        this.ages=ages;
        System.out.println("Обьект под названием "+this.name +" был создан");
    }
    public void age(int ages){
        if(ages>0&&ages<100){
            this.ages=ages;
            System.out.println("Введенный возраст собаки "+this.ages);
        }
    }
    public int getage(){
        return this.ages;
    }
    public void setname(String name){
        this.name=name;
        System.out.println("Имя собаки "+ this.name);
    }
    public String getname(){
        return this.name;
    }
    public int traslatedogagetohumanage(){
        return this.ages*7;
    }
    public String toString(){
        return "Собака "+ this.name +" "+ "c год(ом)ами "+ this.ages;
    }
}
class Pitomniksobak{
    private List<Sobaka> pitomniksobakarray=new ArrayList<Sobaka>();
    {
        System.out.println("Обьект питомник для собак был создан");
    }
    public void adddog(Sobaka sobaka){
        this.pitomniksobakarray.add(sobaka);
        System.out.println(sobaka+"была добавлена в питомник");
    }
    public void adddogs(Sobaka dogs[]){
        this.pitomniksobakarray.addAll(new ArrayList<Sobaka>(Arrays.asList(dogs)));
        System.out.println(Arrays.toString(dogs)+" были добавленны в питомник");
    }
    public String toString(){
        if(!this.pitomniksobakarray.isEmpty()) return "Питомник для собак "+this.pitomniksobakarray;
        else return "Питомник Пуст";
    }
}