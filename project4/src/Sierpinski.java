
public class Sierpinski {
	public static void triangle(double x0, double y0, double x1, double y1, 
			double x2, double y2) {
		double[] x = {x0,x1,x2};
		double[] y = {y0,y1,y2};
		StdDraw.filledPolygon(x, y);
	}
	 
	public static void sierpinski(double x0, double y0, double x1, double y1, 
			double x2, double y2, int level) {
		if (level == 0) {
			triangle(x0,y0,x1,y1,x2,y2);
		}
		else {
			sierpinski(x0,y0,(x0+x2)/2.0,(y0+y2)/2.0,(x0+x1)/2.0,(y0+y1)/2.0,level-1);
			sierpinski((x0+x2)/2.0,(y0+y2)/2.0,x2,y2,(x1+x2)/2.0,(y2+y1)/2.0,level-1);
			sierpinski((x0+x1)/2.0,(y0+y1)/2.0,(x1+x2)/2.0,(y1+y2)/2.0,x1,y1,level-1);
		}
	}
	
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		double x3 = Double.parseDouble(args[4]);
		double y3 = Double.parseDouble(args[5]);
		int level = Integer.parseInt(args[6]);
		sierpinski(x1,y1,x2,y2,x3,y3,level);
	}
}
