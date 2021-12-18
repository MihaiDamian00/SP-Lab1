public class GenerateToC implements Visitor {

    private TableOfContents toc = new TableOfContents("Table of contents");

    public TableOfContents getToc() {
        return toc;
    }

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
        toc.add(section);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
    }

    @Override
    public void visit(ImageProxy imageProxy) {

    }

    @Override
    public void visit(Table table) {

    }

    @Override
    public void visit(Image image) {

    }
}
