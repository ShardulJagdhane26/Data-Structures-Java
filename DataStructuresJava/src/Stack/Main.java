package Stack;

public class Main {
	public static void main(String[] args) {
		Methods m = new Methods();
		
		for(int i = 0; i < 4; i++) {
			m.push();
		}
		m.display();
		m.pop();
		m.display();
		m.peek();
	}
}
