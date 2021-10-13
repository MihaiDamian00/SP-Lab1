import java.util.LinkedList;
import java.util.List;

public interface Element {
    void createNewParagraph(String para);

    void createNewImage(String img);

    void createNewTable(String table);

    void print();
}
