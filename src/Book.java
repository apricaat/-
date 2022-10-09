public class Book {
    public static void main(String[] args){
        Kniga book=new Kniga("Apple hopes",604);
        book.info();
    }
}
class Kniga{
    String name;
    int pages;
    Kniga(String name,int pages){
        this.name=name;
        this.pages=pages;
        System.out.println("Обьект Книга создан");
    }
    void info(){
        System.out.println("Название книги: "+ this.name+" "+"Количество страниц"+" "+this.pages);
    }
}
