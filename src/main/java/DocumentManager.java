public class DocumentManager {
    private Book book;

    private DocumentManager() {
    }

    private static class SingletonHolder {
        private static DocumentManager INSTANCE = new DocumentManager();
    }

    public static DocumentManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
