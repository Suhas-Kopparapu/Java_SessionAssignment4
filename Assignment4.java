package Session2;

import java.util.Scanner;

public class Assignment4 {
public static void main(String[] args){
	/*
	 */
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc1.nextInt();
	switch(n){
	case 1 :
		System.out.println("number of days for janauary is " + 31);
		break;
	case 2 :
	    System.out.println("no of days for feb is  "+ 28);
        break;

	case 3 :
	    System.out.println("no of days for Mar is  "+ 30);
        break;

	case 4 :
	    System.out.println("no of days for Apr is  "+ 31);
        break;
	case 5 :
	    System.out.println("no of days for May is  "+ 30);
        break;
	case 6 :
	    System.out.println("no of days for Jun is  "+ 30);
        break;
	case 7 :
	    System.out.println("no of days for Jul is  "+ 31);
        break;
	case 8 :
	    System.out.println("no of days for Aug is  "+ 31);
        break;
	case 9 :
	    System.out.println("no of days for Sep is  "+ 30);
        break;
	case 10 :
	    System.out.println("no of days for Oct is  "+ 31);
        break;
	case 11 :
	    System.out.println("no of days for Nov is  "+ 30);
        break;
	case 12 :
	    System.out.println("no of days for Dec is  "+ 31);
        break;
   default:
    	 System.out.println("its default");
	}
	
}
}
