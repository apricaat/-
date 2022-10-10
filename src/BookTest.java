import java.util.Date;

public class BookTest {
public static void main(String[]args){
        Book book = new Book("Apple hopes","Vera",new Date());
        System.out.println(book);
        book.setname("My little wonderland");
        book.setwritedate(new Date());
        System.out.println(book);
        }
}
class Book {
        private String name;
        private String author;
        private Date writedate = new Date();

        Book(String name, String author, Date writedate) {
                this.name = name;
                this.author = author;
                this.writedate = writedate;
                System.out.println("Обьект книга создан");
        }

        String getname() {
                return this.name;
        }

        void setname(String name) {
                this.name = name;
        }
        String getauthor(){
                return this.author;
        }
        void setauthor(String author){
                this.author=author;
        }
        Date getwritedate(){
                return this.writedate;
        }
        void setwritedate(Date writedate){
                this.writedate.setTime(writedate.getTime());
        }
        public String toString(){
                return "Имя книги "+ this.name+" "+"автор "+this.author+" год написания "+ this.writedate;
        }


}