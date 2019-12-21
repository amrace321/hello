public class Laptop{
	String color= "white";
	int width = 14;

	void info(){
		System.out.println("the color of laptop is:"+color);
	}
	void width(){
		System.out.println("The width of this is:"+width);
	}

	public static void main(String[]args){
		System.out.println("This is java workshop");
		Laptop laptop = new Laptop();
		laptop.info();
		laptop.width();
	}
}