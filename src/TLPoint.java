import java.awt.Point;

public class TLPoint extends Point {

	/**
	 *  I'm not sure what this is used for, or if I need to use it.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Basic constructor for a point with a blank range field.
	 * @param x
	 * @param y
	 */
	public TLPoint(double x, double y)
	{
		this.x = (int)x;
		this.y = (int)y;
	}
	
	/**
	 * Adds the given vectors.
	 * @param p1 
	 * @return a new TLPoint
	 */
	TLPoint vectorAdd(TLPoint p)
	{
	    return new TLPoint(this.getX() + p.getX(), this.getY() + p.getY());
	}

	/**
	 * Subtracts the given vectors.
	 * @param p
	 * @return a new TLPoint
	 */
	TLPoint vectorSub(TLPoint p)
	{
	    return new TLPoint(this.getX() - p.getX(), this.getY() - p.getY());
	}

	/**
	 * Multiplies the given vector by "a"
	 * @param a 
	 * @return a new TLPoint
	 */
	TLPoint scalarMulti(double a)
	{
	    return new TLPoint(this.getX() * a, this.getY() * a);
	}

	/**
	 * Divides the given vector by "a"
	 * @param a
	 * @return a new TLPoint
	 */
	TLPoint scalarDiv(double a)
	{
	    return new TLPoint(this.getX() / a, this.getY() / a);
	}

	/**
	 * Multiplies the given vectors together.
	 * @param p
	 * @return a scalar value
	 */
	double vectorMulti(TLPoint p)
	{
	    return ((this.getX() * p.getX()) + (this.getY() * p.getY()));
	}

	/**
	 * Computes the sum of squares of the given points
	 * @param p
	 * @return a scalar value
	 */
	double sumOfSq(TLPoint p)
	{
	    TLPoint ret;
	    ret = this.vectorSub(p);
	    return Math.sqrt(Math.pow(ret.getX(), 2) + Math.pow(ret.getY(), 2));
	}

	/**
	 * Computes the sum of squares of the given points
	 * @param p1
	 * @param p2
	 * @return a scalar value
	 */
	double sumOfSq(TLPoint p1, TLPoint p2)
	{
	    TLPoint ret = this.vectorSub(p1.vectorSub(p2));
	    return Math.sqrt(Math.pow(ret.getX(), 2) + Math.pow(ret.getY(), 2));
	}

	/**
	 * Takes three points and their distances to a target point, and calculates the coordinates
	 * of the target point
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param r1
	 * @param r2
	 * @param r3
	 * @return
	 */
	Point treasureLoc(TLPoint p1, TLPoint p2, TLPoint p3, double r1, double r2, double r3)
	{
	    TLPoint ex; TLPoint ey;
	    double i; double j;
	    double d;
	    double x; double y;
	    Point t;
	    
	    /* 1. ex = (P2 - P1)/||P2 - P1||
	     * 2. i = ex(P3 - P1)
	     * 3. ey = (P3 - P1 - i*ex)/||P3 - P1 - i*ex||
	     * 4. d = ||P2 - P1||
	     * 5. j = ey(P3 - P1)
	     * 6. x = (pow(r1) - pow(r2) + pow(d))/2d
	     * 7. y = (pow(r1) - pow(r3) + pow(i) + pow(j))/2j - i*x/j
	     * 8. T = p1 + x*ex + y*ey
	     */ 
	    
	    ex = p2.vectorSub(p1).scalarDiv(p2.sumOfSq(p1));
	    i = p3.vectorSub(p1).vectorMulti(ex);
	    ey = p3.vectorSub(p1).vectorSub(ex.scalarMulti(i)).scalarDiv(
	    		p3.vectorSub(p1).sumOfSq(vectorSub(ex.scalarMulti(i))));
	    d = p2.sumOfSq(p1);
	    j = ey.vectorMulti(p3.vectorSub(p1));
	    x = (Math.pow(r1, 2) - Math.pow(r2, 2) + Math.pow(d, 2))/(2*d);
	    y = (Math.pow(r1, 2) - Math.pow(r3, 2) + Math.pow(i, 2) + Math.pow(j, 2))
	            /(2*j) - (i*x/j);
	    t = p1.vectorAdd(ex.scalarMulti(x)).vectorAdd(ey.scalarMulti(y));

	    return t;
	}

}
