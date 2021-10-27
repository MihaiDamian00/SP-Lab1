import java.util.LinkedList;
import java.util.List;

public class SubChapter extends Element {
    String name;

    public SubChapter(String name) {
        this.name = name;
    }

    @Override
    public void add(Element el) {
    }

    @Override
    public void remove(Element el) {
    }

    @Override
    public Element get(int num) {
        return null;
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
    }
}
