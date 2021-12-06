public class ImageProxy extends Element implements Picture, Visitee {
    private String imageName;
    private Image realImage;

    public ImageProxy(String url) {
        this.imageName = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if(realImage == null) {
            realImage = new Image(imageName);
        }

        return realImage;
    }

    @Override
    void print() {
        loadImage();
        realImage.print();
    }

    @Override
    void add(Element el) {

    }

    @Override
    void remove(Element el) {

    }

    @Override
    Element get(int num) {
        return null;
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
