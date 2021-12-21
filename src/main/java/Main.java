public class Main {
    public static void main(String[] args) throws Exception {
        Book myBook = new Book("My Book");
        Author me = new Author("My Self");
        myBook.addAuthor(me);
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy(".\\images\\WIN_20200331_16_46_23_Pro.jpg"));
        cap1.add(new Image(".\\images\\WIN_20200331_16_46_23_Pro.jpg"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        myBook.addContent(cap1);

        cap1.accept(new RenderContentVisitor());

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        GenerateToC toc = new GenerateToC();
        cap1.accept(toc);
        TableOfContents res = toc.getToc();
        res.render();
    }
}
