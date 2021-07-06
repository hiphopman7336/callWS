package action;

import java.time.LocalDateTime;  // Import the LocalDateTime class

import java.time.format.DateTimeFormatter;
import java.util.Random;

import java.util.Iterator;

import org.json.*; 

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String generateSR() throws Exception {
//		OOOP-640407-202336725		
		String srId = "OOOP-";
	    LocalDateTime currentDateTime = LocalDateTime.now();   
	    DateTimeFormatter dateFormate = DateTimeFormatter.ofPattern("yyyyMMdd");  
	    DateTimeFormatter timeFormate = DateTimeFormatter.ofPattern("HHmmss");  
	    
	    String formattedDate = currentDateTime.format(dateFormate);  
	    String formattedTime = currentDateTime.format(timeFormate); 
	    
	    int yearInt = Integer.parseInt(formattedDate.substring(0,4));
	    yearInt += 543;
	    String yearStr = String.valueOf(yearInt);
	    yearStr = yearStr.substring(2,4);
	    
	    dateFormate = DateTimeFormatter.ofPattern("MMdd"); 
	    formattedDate = currentDateTime.format(dateFormate);  

	    Random rand = new Random(); //instance of random class
	    int randNumber = rand.nextInt(899) + 100;
		srId = srId + yearStr + formattedDate + "-" + formattedTime + randNumber;
		
		return srId;
	}
	
	public static String getCurrentDateTime(){
//		"2563-10-19T12:09:09.000+07:00"
		String currentTime = null;
	    LocalDateTime currentDateTime = LocalDateTime.now();   
	    DateTimeFormatter dateFormate = DateTimeFormatter.ofPattern("yyyy"); 
	    DateTimeFormatter timeFormate = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedDate = currentDateTime.format(dateFormate);  
	    String formattedTime = currentDateTime.format(timeFormate); 

	    int yearInt = Integer.parseInt(formattedDate);
	    yearInt += 543;
	    String yearStr = String.valueOf(yearInt);
	    
	    dateFormate = DateTimeFormatter.ofPattern("MM-dd"); 
	    formattedDate = currentDateTime.format(dateFormate);
	    currentTime = yearStr + "-" + formattedDate + "T" + formattedTime + ".000+07:00";
	    
	    System.out.println("currentTime : "+currentTime);
		
		return currentTime;
	}
	

}
