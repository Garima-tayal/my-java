import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
	public static void main(String[] args) {
		
		ArrayList<String> tasks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("\nTO DP LIST");
			System.out.println("\n 1. Add Tasks");
			System.out.println("\n 2. View Tasks");
			System.out.println("\n 3. Delete Tasks");
			System.out.println("\n 4. Tasks");
			System.out.println("\n Enter Your Choice:");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter tasks");
				String task = sc.nextLine();
				tasks.add(task);
				System.out.println("Task added successfully");
				break;
			case 2:
				System.out.println("\n Your tasks");
				if(tasks.isEmpty()) {
					System.out.println("No tasks found");
				}
				else {
					for(int i=0; i<tasks.size(); i++) {
						System.out.println((i+1)+"."+tasks.get(i));
					}
				}
				break;
			case 3:
				System.out.println("Enter tasks number to be deleted");
				int num = sc.nextInt();
				if(num>0 && num<=tasks.size()) {
					tasks.remove(num - 1);
					System.out.println("Task deleted successfully");
				}
				else {
					System.out.println("invalid task number");
				}
				break;
			default:
				System.out.println("invalid choice.Try again");
			}
		}
		while(choice != 4);
		
		sc.close();
	}
}
