
package Lesson1;

import java.util.Objects;

public class Book {
    private Author author;
    private String books;
    private int yearsOfRelease;


    public Book(String books, Author author, int yearsOfRelease) {

        this.books = books;
        this.yearsOfRelease = yearsOfRelease;
    }


    public String getBooks() {
        return this.books;
    }
    public int getYearsOfRelease(){
        return this.yearsOfRelease;
    }
    public void setYearsOfRelease(int yearsOfRelease){
        this.yearsOfRelease = yearsOfRelease;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())return false;
        Book book = (Book) o;
        return yearsOfRelease == book.yearsOfRelease && Objects.equals(author,book.author) && Objects.equals(books,book.books);
    }
    @Override
    public int hashCode(){
        return Objects.hash(author,books,yearsOfRelease);
    }

    }




