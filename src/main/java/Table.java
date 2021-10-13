public class Table implements Element {
    String title;

    public Table(String title) {
        this.title = title;
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
        System.out.println("Table with Title: " + this.title);
    }
}
