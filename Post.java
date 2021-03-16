import java.util.ArrayList;

public class Post {
	
	ArrayList<InstaItem> elements;
	
	public Post () {
		elements = new ArrayList<InstaItem> ();
	}
	
	public void addItem (InstaItem something) {
		elements.add(something);
	}

	public InstaItem getItem (int position) {
		return elements.get(position);
	}
	
	@Override
	public String toString () {
		String result = "";
		
		for (int i = 0; i < elements.size(); ++i) {
			result += elements.get(i);
			result += "\n";
		}
		
		return result;
	}
	
}
