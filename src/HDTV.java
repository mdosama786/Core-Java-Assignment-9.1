
/**@Program to create a class HDTV with the properties:
• Brand
• Size  
			SORTING THE OBJECT VALUE
*/
/** @HDTV implement comparable class */
public class HDTV implements Comparable<HDTV> {
	/** @Defining the properties */
	private String Brand;
	private int size;

	/** @Constructor defining */
	public HDTV(String Brand, int size) {
		super();
		this.Brand = Brand;
		this.size = size;
		System.out.println(Brand + "\t " + size + " Inch");
	}

	/** @Get method to take the value of brand */
	public String getBrand() {
		return Brand;
	}

	/** @Set method to set the value of TVnames */
	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	/** @Get the size */
	public int getsize() {
		return size;
	}

	/** @Set the size */
	public void setsize(int size) {

		this.size = size;
	}

	/** @Override compareTo method */
	public int compareTo(HDTV o) {
		/** @Comparing the size */
		int compare = Integer.compare(size, o.size);
		if (compare == 0) {
			/** @Compare the brand */
			compare = Brand.compareTo(o.Brand);
			/** @TODO Auto-generated method stub */
		}
		return compare;
	}

	/** @Method to return the string as output */
	public String toString() {
		return "Brand : " + Brand + " Size : " + size + "\n";
	}
}