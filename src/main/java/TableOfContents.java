import java.util.LinkedList;
import java.util.List;

public class TableOfContents extends Element implements Visitee {
    String title;
    List<Element> elementList = new LinkedList<>();

    public TableOfContents(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("TableOfContents with title: " + this.title);
    }

    public void render() {
        System.out.println("TableOfContents with title: " + this.title);
        for (Element el:elementList) {
            el.print();
        }
    }

    @Override
    public void add(Element el) {
        if (el.parent == null) {
            this.elementList.add(el);
            el.parent = this;
        }
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
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element el:elementList) {
            el.accept(visitor);
        }
    }
}
