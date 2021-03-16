import java.util.ArrayList;

public class InstaPhoto extends InstaItem {

	Image thePhoto = new Image();
	
	public Image getThePhoto() {
		return thePhoto;
	}
	public void setThePhoto(Image thePhoto) {
		this.thePhoto = thePhoto;
	}
	
	@Override
	public String toString () {
		String result = "";
		result += "Photo ";
		result += super.toString();
		return result;
	}
	
}
