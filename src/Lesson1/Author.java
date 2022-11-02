package Lesson1;
public class Author {
    private String firstNameOfAuthor;
    private String lastNasmeOfAutor;

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
        Author author = (Author) o;
        if (getFirstNameOfAuthor() != null ? !getFirstNameOfAuthor().equals(author.getFirstNameOfAuthor()) : author.getFirstNameOfAuthor() != null)
            return false;
        return getLastNameOfAutor() != null ? getLastNameOfAutor().equals(author.getLastNameOfAutor()) : author.getLastNameOfAutor() == null;
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











