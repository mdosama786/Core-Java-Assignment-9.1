
/**@Import the util package*/
import java.util.*;

/** @Define pack class */
public class Pack {

	/** @Main method */
	public static void main(String[] args) {
		/** @Initializing the object of class HDTV */
		HDTV o = new HDTV("LG", 45);
		HDTV o1 = new HDTV("SONY", 48);
		HDTV o2 = new HDTV("SAMSUNG", 55);
		/** @Cresting arrayList to store the objects */
		List<HDTV> tv = new ArrayList<HDTV>();
		/** @Adding the objects */
		tv.add(o);
		tv.add(o2);
		tv.add(o1);
		/** @Inbuild method of the collection class to sort */
		Collections.sort(tv);
		/** @Printing the object */
		System.out.println(tv);
	}
}