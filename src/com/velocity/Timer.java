package com.velocity;

	import java.util.TimerTask;
	import java.util.concurrent.TimeUnit;

	public class Timer {
	static long min,sec,hr,totalSec=0;
	private static String format(long value) {
		if(value<10) {
			return 0+""+value;	
		}
		return value+"";
	}
	public static void convertTime() {
		min=TimeUnit.SECONDS.toMinutes(totalSec);
		sec=totalSec-(min*60);
		hr=TimeUnit.MINUTES.toHours(min);
		min=min-(hr*60);
		System.out.println(format(hr) + ":" + format(min) + ":" + format(sec));
		totalSec--;
	}
		public static void main(String[] args) throws Exception{
		totalSec=75;
	      TimerTask timertask = new TimerTask(){
	        @Override
	      public void run() {
	    	  System.out.println("After 1 sec... ");
	    	  convertTime();
	    	  if(totalSec<=0) {
	    		  System.exit(0);
	    	  }
	      }
	      };
	      Timer timer = new Timer();
	      timer.schedule(timertask, 0,1000 );

		}


}
