import java.util.LinkedList;
import java.util.List;

public class Chapter {
    String name;
    List<SubChapter> SubChapterList = new LinkedList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Chapter: " + this.name);
        for (SubChapter sc : SubChapterList) {
            sc.print();
        }
    }

    public int createSubChapter(String subChName) {
        SubChapter subCh = new SubChapter(subChName);
        this.SubChapterList.add(subCh);

        return this.SubChapterList.indexOf(subCh);
    }

    public SubChapter getSubChapter(int index) {
        return this.SubChapterList.get(index);
    }

}
