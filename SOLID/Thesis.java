public class Thesis implements Resource {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "Thesis";
    }
}
