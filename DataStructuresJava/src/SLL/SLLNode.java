package SLL;

public class SLLNode extends Object {

	private int data;
	private SLLNode next;

	public SLLNode(int data,SLLNode next) {
		super();
		this.setData(data);
		this.setNext(next);
	}
	
	public SLLNode(int data) {
		super();
		this.setData(data);
	}

	public SLLNode() {
		super();
	}

	public SLLNode getNext() {
		return next;
	}

	public void setNext(SLLNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
