public class Diary implements IDiary {
    private String contents;

    public Diary(String contents) {
        this.contents = contents;
    }

    @Override
    public String read() {
        return contents;
    }
}
