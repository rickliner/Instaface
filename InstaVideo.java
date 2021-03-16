import java.util.ArrayList;

public class InstaVideo extends InstaItem {

	String moviefilename;
	int length;
	


	public void printInfo() {
		System.out.println("VIDEO " + moviefilename);
		System.out.println("Length " + length + " seconds");
		super.printInfo();
	}
	
	public String getMoviefilename() {
		return moviefilename;
	}
	public void setMoviefilename(String moviefilename) {
		this.moviefilename = moviefilename;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
