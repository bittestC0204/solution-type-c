package problem03;

public class MyStack {
	
	private String[] buffer;
	private int cnt;
	private int count;
	private int resize;


	
	public MyStack( int size ) {
		size = resize;
		buffer = new String[size];
		count=size;
	}
	
	public void push(String item) {
		resize++;
		buffer = new String[resize];
		for(int i=0;i<buffer.length;i++) {
			buffer[i]=item;
		}	
	}

	public String pop() {
		resize--;
		String s = "";
		for(int i=buffer.length;i<=0;i--) {
			s = buffer[i];
			return s;
		}
		if(resize==0) {
			return "null";
		}
		return buffer[0];
	}

	public boolean isEmpty() {
		
		if(resize==0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return buffer.length;
	}
}