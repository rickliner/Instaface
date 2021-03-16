import java.util.ArrayList;

abstract class InstaItem {

	protected String location; // -- options: one string; city/state pair of Strings; lat/long pair of doubles; point of interest
	protected ArrayList<Account> tags;
	long timestamp;
	
	public String toString () {
		String result ="";
		result +=  "At: " + location;
		result += " Timestamp: " + timestamp;
		return result;
	}

	public void printInfo() {
		System.out.println ("AT: " + getLocation() );
		System.out.println("Date: " + getTimestamp() );
//		System.out.println("Tags: " + tags);
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public ArrayList<Account> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Account> tags) {
		this.tags = tags;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

}
