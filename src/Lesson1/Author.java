package Lesson1;

public class Author {
    private String firstNameOfAuthor;
    private String lastNasmeOfAutor;

    public Author(String firstNameOfAuthor,String lastNasmeOfAutor){
        this.firstNameOfAuthor= firstNameOfAuthor;
        this.lastNasmeOfAutor = lastNasmeOfAutor;
    }
    public String toString(){
        return "Автор " + firstNameOfAuthor + " "  + lastNasmeOfAutor;
    }
}
