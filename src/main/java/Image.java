import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture {
    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }

    public void render() {
        System.out.println("Image with name: " + this.imageName);
        content().renderImage();
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

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public PictureContent content() {
        return new PictureContent(this.imageName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getImageName() {
        return imageName;
    }
}
