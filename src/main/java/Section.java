import java.util.LinkedList;
import java.util.List;

public class Section extends Element implements Visitee{
    String title;
    List<Element> elementList = new LinkedList<>();

    public Section(String title) {
        this.title = title;
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
    public void print() {
        System.out.println(this.title);
        for (Element el:elementList) {
            el.print();
        }
    }

    public void render() {
        System.out.println(this.title);
        for (Element el:elementList) {
            el.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element el:elementList) {
            el.accept(visitor);
        }
    }
}