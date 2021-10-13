public class Paragraph implements Element {
    String text;

    public Paragraph(String text) {
        this.text = text;
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
        System.out.println("Paragraph: " + this.text);
    }
}
