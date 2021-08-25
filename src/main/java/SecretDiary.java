public class SecretDiary {
    private IDiary diary;
    private Boolean locked;

    public SecretDiary(IDiary diary) {
        this.diary = diary;
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public void lock(){
        locked = true;
    }

    public String read() {
        if (locked) {
            return "Go away!";
        } else {
            return diary.read();
        }
    }
}
