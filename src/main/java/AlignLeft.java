public class AlignLeft implements AlignStrategy{

    @Override
    public String render(String par) {
        String text = "###" + par;
        return text;
    }
}
