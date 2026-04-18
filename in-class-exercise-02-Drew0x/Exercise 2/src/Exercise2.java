import java.util.*;

public class Exercise2 {
	public static void loopA(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= 10000; j++) {
				sum = sum + j;
			}
		}
	}
	public static void loopB(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			   for (int j = 1; j <= n; j++) {
			      sum = sum + j;
			   }
		}
	}
	public static void loopC(int n) {
		int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= n; j++) {
	           for (int k = 1; k <= n; k++) {
	              sum = sum + k;
	              
	           }
	        }
	    }
	}
	public static void main (String[] args) {
		long loopAStartTime;
		long loopBStartTime;
		long loopAEndTime;
		long loopBEndTime;
		Date currentTime;
		boolean foundN = false;
		int nVal = 10000;
		currentTime = new Date();
		
		while(nVal > 0 && !foundN) { 
			
			loopAStartTime = currentTime.getTime();
			loopA(nVal);
			loopAEndTime = currentTime.getTime();
			long totalATime = loopAEndTime - loopAStartTime;
			
			
			loopBStartTime = currentTime.getTime();
			loopB(nVal);
			loopBEndTime = currentTime.getTime();
			long totalBTime = loopBEndTime - loopBStartTime;
		
		if (totalBTime < totalATime) {
			System.out.println("Found it: " + nVal);
		}
		else {
			nVal --;
			
		}
		

		
	}
	}
	}

