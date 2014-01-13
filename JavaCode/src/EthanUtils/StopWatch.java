
package EthanUtils;

public class StopWatch {
	long startMS;
	long durMS;
	float totalDurationMS;
	float averageMS;
	int runCount;
	
	public StopWatch() {
		startMS = 0;
		durMS = 0;
		totalDurationMS = 0;
		averageMS = 0;
		runCount = 0;
	}
	
	public void start() {
		runCount++;
		durMS = 0;
		startMS = System.currentTimeMillis();
	}
	
	public long stop() {
		long endMS = System.currentTimeMillis();
		durMS = endMS - startMS;
	    totalDurationMS += durMS;
	    averageMS = totalDurationMS / runCount;
		
		return durMS;
	}
	
	public void reset() {
		runCount = 0;
		totalDurationMS = 0;
		durMS = 0;
	}
	
	public int getCount() {
		return runCount;
	}
	
	public float getTotalMS() {
		return totalDurationMS;
	}
	
	public float getAverageMS() {
		return averageMS;
	}
	
	public float getDurationMS() {
		return durMS;
	}
	
	public String getProjectedTimeString(float futureRepetitions) {
		float remainingMS = futureRepetitions * averageMS;
		return toString(remainingMS);
	}
	
	public String getTotalTimeString() 	{
		return toString(totalDurationMS);
	}
	
	public String getAverageTimeString() {
		return toString(averageMS);
	}
	
	public String toString() {
		return toString(durMS);
	}
	
	public String toString(float elapsedMilliSeconds) {
		int durS = (int) (elapsedMilliSeconds / 1000);

		String milliseconds = Integer.toString((int) (elapsedMilliSeconds % 1000));
		String seconds = Integer.toString((int) (durS % 60));
	    String minutes = Integer.toString((int) ((durS % 3600) / 60));
	    String hours = Integer.toString((int) (durS / 3600));
	    

	    if (seconds.length() < 2) {
	      seconds = "0" + seconds;
	    }

	    if (minutes.length() < 2) {
	      minutes = "0" + minutes;
	    }

	    if (hours.length() < 2) {
	      hours = "0" + hours;
	    }

	    return hours + ":" + minutes + ":" + seconds + "." + milliseconds;
	}
}