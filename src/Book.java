import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<String> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String name) {
        this.contents.add(name);
    }

    public void createNewImage(String name) {
        this.contents.add(name);
    }

    public void createNewTable(String name) {
        this.contents.add(name);
    }

    private void print() {
        for (String el : contents) System.out.println(el);
    }

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        discoTitanic.createNewParagraph("Paragraph  1");
        discoTitanic.createNewParagraph("Paragraph  2");
        discoTitanic.createNewParagraph("Paragraph  3");
        discoTitanic.createNewImage("Image 1");
        discoTitanic.createNewParagraph("Paragraph  4");
        discoTitanic.createNewTable("Table 1");
        discoTitanic.print();
    }
}