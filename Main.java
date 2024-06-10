//Cengizhan Çelik 95220129
package NTPproje;

public class Main {
    public static void main(String[] args) {
        Genre genreFilm = new Genre("Django Unchained", "Western");
        Director directorFilm = new Director("Django Unchained", "Quentin Tarantino");

        genreFilm.displayInfo();
        System.out.println();
        directorFilm.displayInfo();
    }
}