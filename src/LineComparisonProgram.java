
public class LineComparisonProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		// variables
		int x1 = 5;
	    int x2 = 6;
	    int y1 = 7;
	    int y2 = 8;
	    int a1 = 3;
	    int a2 = 4;
	    int b1 = 4;
	    int b2 = 5;
	    
	    // Logic to find length of line
	    double lengthOfFirstLine = Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2))));
	    System.out.println("Length of the first line: " +lengthOfFirstLine);
	        
	    double lengthOfSecondLine = Math.sqrt((Math.pow((a2-a1), 2) + (Math.pow((b2-b1), 2))));
	    System.out.println("Length of the second line: " +lengthOfSecondLine);
	    
	    // Creating objects for length of line
	    Integer obj1 = new Integer ((int) lengthOfFirstLine);
	    Integer obj2 = new Integer ((int) lengthOfSecondLine);
	    
	    // Comparing both line
	    System.out.println("Two Lines are: " + (obj1.equals(obj2)));
	}

}
