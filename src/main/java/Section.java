import java.util.LinkedList;
import java.util.List;

public class Section implements Element {
    String title;
    List<Element> elementList = new LinkedList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element el) {
        this.elementList.add(el);
    }

    @Override
    public void remove(Element el) {
        this.elementList.remove(el);
    }

    @Override
    public Element get(int num) {
        return this.elementList.get(num);
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for (Element el:elementList) {
            el.print();
        }
    }
}