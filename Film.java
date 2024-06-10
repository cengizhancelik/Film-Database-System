//Cengizhan Çelik 95220129
package NTPproje;

public class Film {
    private String title;

    public Film(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Film Title: " + title);
    }
}
