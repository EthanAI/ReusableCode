
public class DegreeMath {

	
    /*
     * Gives cosine values. Takes angles in degrees.
     */
    protected static double cosDegrees(double degrees) {
            return Math.cos(degrees/180*Math.PI);
    }
    
    /*
     * Gives sine values. Takes angles in degrees.
     */
    protected static double sinDegrees(double degrees) {
            return Math.sin(degrees/180*Math.PI);
    }
    
    /*
     * Gives tangent values. Takes angles in degrees.
     */
    protected static double tanDegrees(double degrees) {
            return Math.tan(degrees/180*Math.PI);
    }
    
    /*
     * Calculates the angle in degrees, given a tangent value
     */
    protected static double atanDegrees(double tan) {
            return Math.atan(tan)/Math.PI*180;
    }
}
