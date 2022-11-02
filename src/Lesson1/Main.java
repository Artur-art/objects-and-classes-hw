package Lesson1;

public class Main {
    public static void main(String[] args) {
        Author TakashiShimizu = new Author("Takashi","Shimizu");
        Book juOnTheGrudge = new Book("Ju on the grudge", TakashiShimizu,2006);
        System.out.println(juOnTheGrudge);
        System.out.println("автор книги " + TakashiShimizu);
        juOnTheGrudge.setYearsOfRelease(2008);
        System.out.println(juOnTheGrudge);
        System.out.println("are you ready?");

    }
}