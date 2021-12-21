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
        number ++;
        secondNumber = 0;
        Section section1 = new Section(section.getTitle() + "................" + number);

        toc.add(section1);
    }

    @Override
    public void visit(TableOfContents tableOfContents) {

    }

    @Override
    public void visit(Paragraph paragraph) {
        secondNumber ++;
        Paragraph paragraph1 = new Paragraph(paragraph.getText() +"................" + number+"."+secondNumber);

        toc.add(paragraph1);
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        secondNumber ++;
        ImageProxy imageProxy1 = new ImageProxy(imageProxy.url() + "................"+ number+"."+secondNumber);

        toc.add(imageProxy1);
    }

    @Override
    public void visit(Table table) {
        secondNumber ++;
        Table table1 = new Table(table.getTitle() + "................"+ number+"."+secondNumber);

        toc.add(table1);
    }

    @Override
    public void visit(Image image) {
        secondNumber ++;
        Image image1 = new Image(image.getImageName() + "................"+ number+"."+secondNumber);

        toc.add(image1);
    }
}
