
public class Instademo {

	public static void main(String[] args) {

		InstaPhoto pic1 = new InstaPhoto();
		
		pic1.setLocation("Disney World");
		pic1.setTimestamp(210615);
		
//		System.out.println(pic1);

//		pic1.printInfo();
		
		InstaVideo amovie = new InstaVideo();
		amovie.setLocation("sPace University");
		amovie.setLength(42);
		amovie.setTimestamp(210304);
		
//		amovie.printInfo();
		
		Post firstPost = new Post ();
		firstPost.addItem (pic1);
		firstPost.addItem (amovie);
//		firstPost.addItem (new InstaItem() );
		
		InstaPhoto temp = (InstaPhoto) firstPost.getItem(1);
		System.out.println(temp.getThePhoto());
		
	//	System.out.println(firstPost);
		
	}

}
