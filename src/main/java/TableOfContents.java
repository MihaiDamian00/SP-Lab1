public class TableOfContents extends Element{
    String title;

    public TableOfContents(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("TableOfContents with title: " + this.title);
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
}
