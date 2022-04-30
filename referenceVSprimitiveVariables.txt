public class referenceVSprimitiveVariables {

	public static void main(String[] args) {
		
		byte x = 1;
		byte y = x;
		x = 2;
		System.out.println("y = " + y); // "y" not affected by change x=2 since "y" has its own allocated memory set by primitive variable "byte"
		
		Point point1 = new Point(1, 1); // Point (x, y)
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2); // "x" is affected by change x=2 since "x" has reference to Point allocated memory set by reference variable "Point"
		
	}

}
