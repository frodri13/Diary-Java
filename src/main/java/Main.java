public class Main {
    public static void main(String[] args) {
        Diary diary = new Diary("Hello there");
        SecretDiary secretDiary = new SecretDiary(diary);

        System.out.println(secretDiary.read());

        secretDiary.unlock();
        System.out.println(secretDiary.read());
    }
}
