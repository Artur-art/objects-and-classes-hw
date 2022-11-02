package Lesson1;
public class Book {
    private String books;
    private int yearsOfRelease;
    private Author author;

    public Book(String books, Author author, int yearsOfRelease) {

        this.books = books;
        this.yearsOfRelease = yearsOfRelease;
        this.author = author;

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
        public String toString () {
            return "Название книги " + books + " " + yearsOfRelease;
        }
        public Author getAuthor () {
            return author;
        }
    }

