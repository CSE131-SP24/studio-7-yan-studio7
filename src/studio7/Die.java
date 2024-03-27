package studio7;

public class Die {
	
	private int numberOfSides;
	
	public Die(int sides) {
		numberOfSides = sides;
	}
	
	public Die() {
		numberOfSides = 6;
	}
	
	public static int throwADie(Die a) {
		return (int)(Math.random() * a.numberOfSides) + 1;
	}
	
	
	public static void main(String[] args) {
		Die a = new Die();
		
		System.out.println(throwADie(a));
	}
	
	
}

