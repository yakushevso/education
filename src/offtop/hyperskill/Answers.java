package offtop.hyperskill;

public class Answers<T> {
    String url;
    boolean checked;
    T answers;

    public Answers(String url, boolean checked, T answers) {
        this.url = url;
        this.checked = checked;
        this.answers = answers;
    }
}
