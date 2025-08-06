package com.rohan;
 // task 2 day 5
class Print {
	 public void print() {
	     System.out.println("Print");
	 	}
	}


	class InkjetPrinter extends Print {
	 
	 public void print() {
	     System.out.println("Inkjet Printer");
	 	}
	}


	class LaserPrinter extends Print {

	 public void print() {
	     System.out.println("Laser Printer");
	 	}
	}

public class TASK_10_PrinteR_the_Chapya_ink {
	public static void main(String[] args) {
	     

	     Print obj = new InkjetPrinter();   
	     obj.print();                 

	     Print obj1 = new LaserPrinter();    
	     obj1.print(); 
	}
}
