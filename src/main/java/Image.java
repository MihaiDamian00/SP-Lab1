public class Image implements Element {
    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void createNewParagraph(String para) {

    }

    @Override
    public void createNewImage(String img) {

    }

    @Override
    public void createNewTable(String table) {

    }

    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }
}
