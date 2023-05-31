package RestaurantBilling;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int choice, quantity;
	public static char again;
	public static double total = 0, pay;
	
	public static void menu() {
		System.out.println("-------------------------------");
		System.out.println("\tWelcome to our Restaurant");
		System.out.println("\tHere are our menu items");
		System.out.println("\tNashville Hot Chicken with coleslaw => $80");
		System.out.println("\tBibimbap							  => $70");
		System.out.println("\tGrilled A5 Wagyu with fries		  => $400");
		System.out.println("\tSignature Ramen with Charsiu		  => $100");
		System.out.println("-------------------------------");
		System.out.println();
		order();
	}
	
	public static void order() {
		System.out.println("(1) for Nashville hot chicken");
		System.out.println("(2) for Bibimbap");
		System.out.println("(3) for A5 Wagyu");
		System.out.println("(4) for Ramen");
		System.out.println("(5) to cancel");
		System.out.println("Press the number you want to order: ");
		
		choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You've chosen the Nashville Hot Chicken");
			System.out.println("How many portions do you want?");
			quantity = scanner.nextInt();
			scanner.nextLine();
			total += quantity * 80;
			checkout();
			break;
		case 2:
			System.out.println("You've chosen the Bibimbap");
			System.out.println("How many bowls do you want?");
			quantity = scanner.nextInt();
			scanner.nextLine();
			total += quantity * 80;
			checkout();
			break;
		case 3:
			System.out.println("You've chosen the A5 Wagyu");
			System.out.println("How many portions (8oz) do you want?");
			quantity = scanner.nextInt();
			scanner.nextLine();
			total += quantity * 80;
			checkout();
			break;
		case 4:
			System.out.println("You've chosen our Signature Ramen");
			System.out.println("How many portions do you want?");
			quantity = scanner.nextInt();
			scanner.nextLine();
			total += quantity * 80;
			checkout();
			break;
		case 5: 
			System.exit(0);
			break;
		default:
			System.out.println("Please enter one of the menu items");
			order();
		}
		
	}
	
	public static void checkout() {
		System.out.println("Do you want to continue ordering?");
		System.out.println("Press [y] for Yes and [n] for No: ");
		again = scanner.nextLine().toLowerCase().charAt(0);
		
		if(again == 'y') {
			order();
		}
		else if (again == 'n') {
			System.out.println("total: $" + total);
			System.out.println("Please Enter your payment: ");
			pay = scanner.nextDouble();
			scanner.nextLine();
			if(pay < total) {
				System.out.println("Sorry that was not enough to pay the bill");
				checkout();
			}
			else {
				System.out.println("Customer's return: " + (pay-total));
				System.out.println(">========================<");
			}
		}
		else {
			System.out.println("Invalid input. Try Again");
			checkout();
		}
		
	}
	
	public static void main(String[] args) {
		
		menu();
	}

}
