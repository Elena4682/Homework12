package pro.sky.java.course1.lesson1;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name=name;
        this.surname=surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    @Override
    public String toString() {
        return "Автор ( Имя:" + name + " , фамилия:" + surname + " )";
    }
    @Override
    public boolean equals(Object i){
        if (this == i)return true;
        if (i == null || getClass() != i.getClass())return false;
        Author author = (Author) i;
        return name.equals(author.name)&& surname.equals(author.surname);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(name, surname);
    }


}
