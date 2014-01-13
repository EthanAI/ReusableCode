public class TimeandDates {
	
    public static void main(String[] args) {
    	System.out.println("Eclipse test ok");
    }
  
        /*
         * getDayNumber(int date)
         * 
         * Used by the EOTCorrection() method
         * 
         * Get the number of the day in the year (1-365 or 366)
         * Seems likely this code will be used in future projects so making a 
         * separate method for it.
         * Check vs. http://amsu.cira.colostate.edu/julian.html
         */
        protected static int getDayNumber(int date) {
                int dayNumber = 0;
                int year = 0;
                int month = 0;
                int day = 0;
                boolean isLeapYear = false;
                int[] monthLengthStandard = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                
                //break date into pieces
                day = date % 100;
                month = (int) (date % 10000) / 100;
                year = (int) date / 10000;

                //check for leapyear
                if((year % 400) == 0)
                   isLeapYear = true;
                else if ((year % 100) == 0)
                   isLeapYear = false;
                else if((year % 4) == 0)
                   isLeapYear = true;
                else
                   isLeapYear = false;
                
                //calculate day of the year
                dayNumber = day;
                for(int i = 0; i < month - 1; i++) {
                        dayNumber += monthLengthStandard[i];
                }
                if(isLeapYear && month > 2) //add leap year day 
                        dayNumber++;
                return dayNumber;
        }
        

}