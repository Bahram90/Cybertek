
public class Assignment_8 {
	 public static void main(String[] args) {
	        System.out.println(getDurationString(3600));
	    }
	    public static String getDurationString(int minute, int second){
	        int hour;
	        if(minute<0 || second<0 || second>59){

	            return "Invalid Value";
	        }
	            hour=minute/60;
	            minute=minute%60;
	            return hour+" h "+minute+" m "+second+" s";

	    }
	    public static String getDurationString(int seconds){
	        int newSeconds;
	        if(seconds<=0){
	            return "Invalid Value";
	        }
	            int minute=seconds/60;
	            newSeconds=seconds%60;
	            return getDurationString(minute,newSeconds);

	    }
}
