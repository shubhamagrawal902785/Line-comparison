package com.lincomparison;
import java.util.Scanner;
public class Length {
	
	

	

	 static double length(int x1,int y1, int x2, int y2){
	        double length = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
	        System.out.println("The line length 1 is :" + length);
	        return length;
	    }
	
	

	    public static void main(String[] args) {

	        Scanner Sc = new Scanner(System.in);

	        // input co=ordinate of line 1
	        System.out.println("Enter the value of X1 in line 1");
	        int x1 = Sc.nextInt();
	        System.out.println("Enter the value of Y1 in line 1");
	        int y1 = Sc.nextInt();
	        System.out.println("Enter the value of X2 in line 1");
	        int x2 = Sc.nextInt();
	        System.out.println("Enter the value of Y2 in line 1");
	        int y2 = Sc.nextInt();

	        // input co=ordinate of line 2
	        System.out.println("Enter the value of X1 in line 2");
	        int a1 = Sc.nextInt();
	        System.out.println("Enter the value of Y1 in line 2");
	        int b1 = Sc.nextInt();
	        System.out.println("Enter the value of X2 in line 2");
	        int a2 = Sc.nextInt();
	        System.out.println("Enter the value of Y2 in line 2");
	        int b2 = Sc.nextInt();

	        Length obj = new Length();
	        double l1 = obj.length(x1,y1,x2,y2);
	        double l2 = obj.length(a1, b1,a2,b2);

	        String ln1 = Double.toString(l1);
	        String ln2 = Double.toString(l2);

	        if (ln1.compareTo(ln2) < 0) {
	            System.out.println(" Line 1 is grater than line 2");
	        } else if (ln1.compareTo(ln2) > 0) {
	        } else if (ln1.compareTo(ln2) == 0){
	            System.out.println("Both lines are equal ");
	        }
	    }
	}