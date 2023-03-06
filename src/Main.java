import pro.sky.java.course1.lesson1.Author;
import pro.sky.java.course1.lesson1.Book;

public class Main {
    public static void main(String[] args) {
        Author author1= new Author("Лев", "Толстой");
        Author author2= new Author("Александр", "Пушкин");

        Book book1= new Book("Война и мир", author1,1873);
        Book book2= new Book("Евгений Онегин", author2,1830);
        System.out.println("Название:" + book1.getTitle()+ " Автор:" + book1.getAuthor().getName()+ " "
                + book1.getAuthor().getSurname() + " Год:" + book1.getYear());
        System.out.println("Название:" + book2.getTitle()+ " Автор:" + book2.getAuthor().getName()+ " "
                + book2.getAuthor().getSurname() + " Год:" + book2.getYear());
        book1.setYear(1863);
        System.out.println("Название:" + book1.getTitle()+ " Автор:" + book1.getAuthor().getName()+ " "
                + book1.getAuthor().getSurname() + " Год:" + book1.getYear());

        System.out.println(book1);
        System.out.println(author1);

        if (author1 == author2) {
            System.out.println(" Книги равны");
        }else {
            System.out.println(" Книги не равны");
            }
        if (book1 == book2) {
            System.out.println(" Книги равны");
        }else {
            System.out.println(" Книги не равны");
        }
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
    }
}