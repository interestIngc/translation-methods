public class Terminal extends RuleItem {
    private final String text;

    public Terminal(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
