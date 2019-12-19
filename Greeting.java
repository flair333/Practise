/*************************************************************************
 * This is a simple program in java just to tell user greeting according to the time
 * its not perfect a lot can be improved but its just the begianing so that why 
 * we started from the begaining 

*******************************************************************************/
import java.util.Calendar;
public class Main
{
    
	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	int Hour_of_day = cal.get(Calendar.HOUR_OF_DAY);
	if(Hour_of_day>22){
	    	System.out.println("Good night");
	}
	else if(Hour_of_day>12){
	    System.out.println("Good evening");
	    
	}
	else if(Hour_of_day>6){
	    System.out.println("Good Morning");
	    
	}
	 System.out.println("Current Hour (24 hour format) : " + cal.get(Calendar.HOUR_OF_DAY));
	}
}