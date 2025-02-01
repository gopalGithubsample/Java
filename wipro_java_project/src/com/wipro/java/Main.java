class MyClass{
	int num = 5;
	
	public void changeValue(int num) {
		this.num =num;
	}
}
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.changeValue(10);
		
		System.out.println(obj.num);

	}

}
