
public class LineComparisonProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program");
		// variables
		int x1 = 5;
	    int x2 = 6;
	    int y1 = 7;
	    int y2 = 8;
	    
	    //Logic to find length of line
	    double lengthOfLine = Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2))));
        System.out.println("Length of the line: " +lengthOfLine);

	}

}
