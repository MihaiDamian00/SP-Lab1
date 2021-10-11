import java.util.LinkedList;
import java.util.List;

public class SubChapter {
    String name;
    List<Paragraph> paragraphList = new LinkedList<>();
    List<Image> imageList = new LinkedList<>();
    List<Table> tableList = new LinkedList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String para) {
        this.paragraphList.add(new Paragraph(para));
    }

    public void createNewImage(String img) {
        this.imageList.add(new Image(img));
    }

    public void createNewTable(String table) {
        this.tableList.add(new Table(table));
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for (Paragraph par : paragraphList) {
            System.out.print("Paragraph: ");
            par.print();
        }

        for (Image img : imageList) {
            System.out.print("Image with name:");
            img.print();
        }

        for (Table table : tableList) {
            System.out.print("Table with Title: ");
            table.print();
        }
    }
}
