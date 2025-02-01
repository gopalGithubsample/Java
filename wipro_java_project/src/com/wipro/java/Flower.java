/**
 * 
 */

/**
 * 
 */
public class Flower {

	String name;
	String color;
	
	public Flower(String name, String color) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.color = color;
	}
	
	void display() {
		System.out.println("Flower name:"+name);
		System.out.println("Flower color:"+color);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f1 = new Flower("Rose","Red");
		f1.display();

	}

}
