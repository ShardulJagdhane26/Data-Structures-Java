package HashTable;

public class Main {
	
	public static void main(String[] args) {
        Methods methods = new Methods();
        methods.addData(10);
        methods.addData(20);
        methods.addData(30);
        methods.addData(26);
        methods.addData(10);
        methods.addData(36);
        methods.addData(46);
        methods.addData(16);
        methods.addData(32);
        methods.addData(48);
        methods.addData(64);
        
        methods.display();
        
        System.out.println();
        methods.search(80);
        
        System.out.println();
        methods.remove_element(80);
        
        methods.display();
        
    	
	}
}
