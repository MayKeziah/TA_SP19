package coordinates;

/******************************************************************
 * <p> A point representing a location (x, y) in coordinate space, 
 *     specified in integer precision.
 ******************************************************************/

public class Point {

	/***********************************************
	 * 	data fields
	 * 	stores the (x, y) location of point
	 ***********************************************/
	private int x;
	private int y;
	
	/**********************************************************
	 *	constructs and initializes the current point at the 
	 *  origin (0,0) of the coordinate plane.
	 **********************************************************/
	public Point() {
		//update: call the third constructor
	}
	
	/**********************************************************
	 * 	constructs and initializes the current point to the 
	 *  location specified by other Point passed.
	 * 	@param other point object.
	 **********************************************************/
	public Point(Point other) {
		//update: call the third constructor
	}
	
	/***********************************************************
	 * 	constructs and initializes the current point to the 
	 *  specified (x,y) location.
	 * 	@param x the x coordinate of point to construct.
	 * 	@param y the y coordinate of point to construct.
	 ***********************************************************/
	public Point(int x, int y) {
		// update: reduce redundancy with setLocation
	}
	
	/***********************************************************
	 * 	computes the distance between the current Point and 
	 *  another Point object in coordinate space.
	 *  @param other point object.
	 * 	@return distance between two points.
	 ***********************************************************/
	public double distance(Point other) {
		// update: calculate the distance between this and other
		return 0.0;
	}
	
	/***************************************************************
	 * 	compares the contents of the current object to the passed
	 *  object. Returns true if they have the same (x,y) position.
	 * 	@return result of content evaluation.
	 ***************************************************************/
	public boolean equals(Object obj) {
		//update: compare the state of two objects.
		return false;
	}
	
	/***************************************************************
	 * 	returns the x coordinate of the point in integer precision.
	 * 	@return x the x coordinate of point object.
	 ***************************************************************/
	public int getX() {
		//update: use Javadoc description aboves
		return 0;
	}
	
	/***************************************************************
	 * 	returns the y coordinate of the point in integer precision.
	 * 	@return y the y coordinate of point object.
	 ***************************************************************/
	public int getY() {
		//update: use Javadoc description above
		return 0;
	}
	
	/***************************************************************
	 * 	changes the location of the current point in coordinate 
	 *  space to the location specified by point other. 
	 * 	@param other the specified point .
	 ***************************************************************/
	public void setLocation(Point other) {
		//update: use Javadoc description above
	}
	
	/*****************************************************************
	 * 	changes the location of the point in the coordinate plane to 
	 *  the location specified by the values (x, y). 
	 * 	@param x the specified x coordinate value.
	 * 	@param y the specified y coordinate value.
	 *****************************************************************/
	public void setLocation(int x, int y) {
		//update: use Javadoc description above
	}
	
	/***************************************************************
	 * 	returns string representation of point.
	 * 	@return point (x, y) coordinates.
	 ***************************************************************/
	public String toString() {
		return "(" + x +  ", " + y + ")";
	}
	
	/***************************************************************
	 * 	shifts the current point's (x,y) location by dx along the 
	 *  x-axis and dy along the y-axis, giving (x + dx, y + dy).
	 * 	@param dx the specified x coordinate value.
	 * 	@param dy the specified y coordinate value.
	 ***************************************************************/
	public void translate(int dx, int dy) {
		//update: use Javadoc description above
	}
	
}
