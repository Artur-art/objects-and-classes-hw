package Lesson1;

import java.util.Objects;

public class Author {
    private String firstNameOfAuthor;
    private String lastNasmeOfAutor;
    Author author;

    public Author(String firstNameOfAuthor, String lastNasmeOfAutor) {
        this.firstNameOfAuthor = firstNameOfAuthor;
        this.lastNasmeOfAutor = lastNasmeOfAutor;
    }

    public String getFirstNameOfAuthor() {
        return firstNameOfAuthor;
    }

    public String getLastNameOfAutor() {
        return lastNasmeOfAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(firstNameOfAuthor, author.firstNameOfAuthor) && Objects.equals(lastNasmeOfAutor, author.lastNasmeOfAutor)return false;

    }

    @Override
    public int hashCode() {
        int result = getFirstNameOfAuthor() != null ? getFirstNameOfAuthor().hashCode() : 0;
        result = 31 * result + (getLastNameOfAutor() != null ? getLastNameOfAutor().hashCode() : 0);
        return result;

    }
    public String toString{
        return "Автор " + firstNameOfAuthor + " "  + lastNasmeOfAutor;
    }


    @Override
    public int hashCode() {
        int result = getFirstNameOfAuthor() != null ? getFirstNameOfAuthor().hashCode() : 0;
        result = 31 * result + (getLastNameOfAutor() != null ? getLastNameOfAutor().hashCode() : 0);
        return result;

    }
    public String toString(){
        return "Автор " + firstNameOfAuthor + " "  + lastNasmeOfAutor;
    }
}











