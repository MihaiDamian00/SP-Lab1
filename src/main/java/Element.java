import java.util.LinkedList;
import java.util.List;

public interface Element {
    void print();

    void add(Element el);
    void remove(Element el);
    Element get(int num);
}
