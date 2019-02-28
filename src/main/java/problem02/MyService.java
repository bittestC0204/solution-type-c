package problem02;

public class MyService extends BaseService {
	private String sevice = "서비스시작";
	
	public void service(String state) {
		if(state.equals("오후")) {
			afternoon();
		}	
		System.out.println(state+sevice);
	}

	public String afternoon() {
		return "오후"+sevice;	
	}
}
