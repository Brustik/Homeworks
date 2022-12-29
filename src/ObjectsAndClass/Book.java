package ObjectsAndClass;

public class Book {
    private Author author;
    private final String title;
    private int yearPublication;

    public Book(Author author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }


}

