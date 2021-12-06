public class BookStatistics implements Visitor{
    private int imageNumber, tableNumber, paragraphNumber;

    public BookStatistics() {
        this.imageNumber = 0;
        this.tableNumber = 0;
        this.paragraphNumber = 0;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + this.imageNumber);
        System.out.println("*** Number of tables: " + this.tableNumber);
        System.out.println("*** Number of paragraphs: " + this.paragraphNumber);
    }

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section section) {

    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        this.paragraphNumber ++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.imageNumber ++;
    }

    @Override
    public void visit(Table table) {
        this.tableNumber ++;
    }

    @Override
    public void visit(Image image) {
        this.imageNumber ++;
    }
}
