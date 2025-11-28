package Queue;

public class Queue_Main {
	public static void main(String[] args) {
	
		Queue_Functions q = new Queue_Functions();
		
		System.out.println("QUEUE : First In First Out.");
		for (int i = 0; i < 5; i++) {
			q.add_element();
		}
		
		q.print_elements();
		
		q.remove_element();
		q.print_elements();
		
		q.remove_element();
		q.print_elements();
	}
}
