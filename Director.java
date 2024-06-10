//Cengizhan Çelik 955220129
package NTPproje;

	public class Director extends Film {
	    private String directorName;

	    public Director(String title, String directorName) {
	        super(title);
	        this.directorName = directorName;
	    }

	    public String getDirectorName() {
	        return directorName;
	    }

	    public void setDirectorName(String directorName) {
	        this.directorName = directorName;
	    }


	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Director: " + directorName);
	    }
	}