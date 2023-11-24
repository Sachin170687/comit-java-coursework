package org.comit.course._06_Practice;

import java.util.concurrent.TimeUnit;

/*6.Write a Java program to create a class called "TrafficLight" with attributes for colour and 
 * duration, a parameterized constructor and methods to change the colour and check for red or green. 
 * The method that changes the colour automatically changes from red to green and vice versa.
 */


class TrafficLight {
	
	         String color;
	         int duration;
			
	        
	         
	         TrafficLight(String color, int duration) {
				super();
				this.color = color;
				this.duration = duration;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public int getDuration() {
				return duration;
			}
			public void setDuration(int duration) {
				this.duration = duration;
			}
	         
	        
			void changeColor(String color){
	        	 
	        	 if("red".equals(this.color)) {
	        		 this.color="green";
	        	 }else {
	        		 this.color="red";
	        	 }
			}
	       	 
	        boolean checkColor(String color) {
	        		 
	        		 return color.equals(this.color);
	        		 
	        	 }	
	
}


public class Exer06 {

	public static void main(String[] args) throws InterruptedException{
		
			TrafficLight t1=new TrafficLight("red",5);
			System.out.println(t1.checkColor("red"));
			t1.changeColor("red");
			System.out.println(t1.getColor());
            TimeUnit.SECONDS.sleep(5);		
		
            TrafficLight t2=new TrafficLight("green",5);
			System.out.println(t2.checkColor("green"));
			t2.changeColor("green");
			System.out.println(t2.getColor());
            TimeUnit.SECONDS.sleep(5);		
		
	}

}
