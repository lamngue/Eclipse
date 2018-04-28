import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class NBody {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException {
		double distance,xDistance,yDistance,force,forceX,forceY;
		double big_t = Double.parseDouble(args[0]);
		double delta_t = Double.parseDouble(args[1]);
		double gravitation = 6.67e-11;
		String resourceFolder = "resources/";
		String fileName = resourceFolder + args[2];
		FileInputStream fileInputStream = new FileInputStream(fileName);
		System.setIn(fileInputStream);

		// Use StdIn to read from the file.
		int numBodies = StdIn.readInt();
		double universeRadius = StdIn.readDouble();
		
		// Set the scale for the universe and play the music
		StdDraw.setXscale(-universeRadius,universeRadius);
		StdDraw.setYscale(-universeRadius,universeRadius);
		StdAudio.play("2001.mid");
		// Initialize six parallel arrays for planets.txt
		double[] rx = new double[numBodies];
		double[] ry = new double[numBodies];
		double[] vx = new double[numBodies];
		double[] vy = new double[numBodies];
		double[] mass = new double[numBodies];
		String[] image = new String[numBodies];
		
		// fill in the data for 6 arrays
		for (int i = 0; i < numBodies; i++) {
		    rx[i] = StdIn.readDouble();
		    ry[i] = StdIn.readDouble();
		    vx[i] = StdIn.readDouble();
		    vy[i] = StdIn.readDouble();
		    mass[i] = StdIn.readDouble();
		    image[i] = StdIn.readString();
		}	
		double[] fx = new double[numBodies];
		double[] fy = new double[numBodies];
		
}
}