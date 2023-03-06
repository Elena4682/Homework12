package pro.sky.java.course1.lesson1;

public class Book {
    private String title;
    private Author author;
    private int year;
    public Book(String title, Author author, int year){
        this.title= title;
        this.author= author;
        this.year= year;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Книга ( Название: " + title + " , " + author + " , год: " + year +" )";
    }
    @Override
    public boolean equals(Object z){
        if (this == z)return true;
        if (z == null || getClass() != z.getClass())return false;
        Book book = (Book) z;
        return title.equals(book.title)&& author.equals(book.author)&& year== book.year;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(title, author, year);
    }

    }
