import java.util.LinkedList;
import java.util.List;

public class Book {
    String title;
    List<Author> AuthorList = new LinkedList<>();
    List<Chapter> ChapterList = new LinkedList<>();

    public Book(String title) {
        this.title = title;
//        this.AuthorList = new LinkedList<Author>();
    }

    public void addAuthor(Author author) {
        this.AuthorList.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter chap = new Chapter(chapterName);
        this.ChapterList.add(chap);

        return this.ChapterList.indexOf(chap);
    }

    public Chapter getChapter(int index) {
        return this.ChapterList.get(index);
    }

    public void print() {
        System.out.println("Title: " + this.title);
        System.out.println("Author(s): ");
        for (Author aut : AuthorList) {
            aut.print();
        }
        System.out.println("Chapters: ");
        for (Chapter chp : ChapterList) {
            chp.print();
        }
    }
}
