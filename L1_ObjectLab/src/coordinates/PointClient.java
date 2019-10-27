/**
 * 
 */
package coordinates;

/**
 * @author E
 *
 */
public class PointClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point a = new Point(1, 2);
		Point b = new Point(3, 4);
		System.out.println(a + "\n" + b);
		
		a = b;
		System.out.println("\n" + a + "\n" + b);
		
		b.setLocation(5, 1);
		System.out.println("\n" + a + "\n" + b);
		
		a.setLocation(4, 5);
		System.out.println("\n" + a + "\n" + b);

	}

}
