package ua.org.skravchenko;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long numInp;
	    int timeVar = 1;
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter miliseconds: ");
	        if(sc.hasNextLong() || !sc.hasNextLine()) {
	          numInp = sc.nextLong();
				System.out.println("Mileseconds = " + numInp);
	            timeVar *= 1000;
	            System.out.println("Seconds = " + (long)Math.floor(numInp/timeVar));
	            timeVar *= 60;
	            System.out.println("Minutes = " + (long)Math.floor(numInp/timeVar));
	            timeVar *= 60;
	            System.out.println("Hours = " + (long)Math.floor(numInp/timeVar));
	            timeVar *= 24;
	            System.out.println("Days = " + (long)Math.floor(numInp/timeVar));
	            timeVar *= 365;
	            System.out.println("Years = " + (long)Math.floor(numInp/timeVar));
	        } else {
	          System.out.println("Wrong count!!!");
	        }
    }
}
