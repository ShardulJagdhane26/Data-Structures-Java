package SCLL;

public class SCLMain {
	
	public static void main(String[] args) {
		Methods n = new Methods();
		
		n.add_first(10);
		n.add_first(11);
		n.add_first(12);
		n.add_first(13);
		
		
//		n.add_middle(44, 4);
		n.print();
		
		n.del_middle(12);
		
		
		n.print();
		
	}
}
