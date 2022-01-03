public class GenerateToC implements Visitor {

    private TableOfContents toc = new TableOfContents("Table of contents");
    private int number = 0, secondNumber = 0;

    public TableOfContents getToc() {
        return toc;
    }

    @Override
    public void visit(Book book) {
    }

    @Override
    public void visit(Section section) {
        
        toc.addEntry(section.getTitle()+ "......"+secondNumber);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        secondNumber ++;
      
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        secondNumber ++;
        
    }

    @Override
    public void visit(Table table) {
        secondNumber ++;
        
    }

    @Override
    public void visit(Image image) {
        secondNumber ++;
        
    }
}
