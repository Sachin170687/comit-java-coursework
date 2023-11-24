package org.comit.course._06_Practice;

public class Exer09 {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<10;i++) {
			
			try {
			System.out.println(i);
			Thread.sleep(1000);
			}
		
		     catch(InterruptedException e){
		    	 System.out.println(e);
					
					
		}
		
		}

	}

}
