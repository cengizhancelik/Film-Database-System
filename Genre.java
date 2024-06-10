//Cengizhan Çelik 95220129
package NTPproje;

	public class Genre extends Film {
	    private String genreName;

	    public Genre(String title, String genreName) {
	        super(title);
	        this.genreName = genreName;
	    }

	    public String getGenreName() {
	        return genreName;
	    }

	    public void setGenreName(String genreName) {
	        this.genreName = genreName;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Genre: " + genreName);
	    }

}
