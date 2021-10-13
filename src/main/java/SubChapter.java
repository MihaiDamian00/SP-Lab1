import java.util.LinkedList;
import java.util.List;

public class SubChapter implements Element {
    String name;

    List<Element> elementList = new LinkedList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String para)  {
        this.elementList.add(new Paragraph(para));
    }

    public void createNewImage(String img) {
        this.elementList.add(new Image(img));
    }

    public void createNewTable(String table) {
        this.elementList.add(new Table(table));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for (Element par : elementList) {
            par.print();
        }
    }
}
