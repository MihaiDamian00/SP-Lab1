import java.util.LinkedList;
import java.util.List;

public class Image implements Element {
    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println("Image with name: " + this.imageName);
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
