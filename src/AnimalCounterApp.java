
public class AnimalCounterApp {
	
	public static void main(String[] args) {
		System.out.println("Counting alligators...");
		System.out.println();
		//Create an alligator
		Alligator alligator = new Alligator();
		count(alligator, 3);
		
		System.out.println("Counting sheep...");
		System.out.println();
		//Create first sheep, name it Blackie
		Sheep sheep1 = new Sheep("Blackie");
		count(sheep1, 2);
		
		try {
			//Create a clone of Blackie, name it Dolly
			Sheep sheep2 = (Sheep) sheep1.clone();
			sheep2.setName("Dolly");
			
			//Count the second sheep, the clone named Dolly
			count(sheep2, 3);
			
		} catch (CloneNotSupportedException ex) {
			System.out.println(ex);
		}
		
		//Count Blackie to verify name change on sheep2 affected only the clone
		count(sheep1, 1);
		
	}
	
	public static void count(Countable c, int maxCount) {
		c.resetCount();
		for (int i = 0; i < maxCount; i++) {
			System.out.println(c.getCountString());
			c.incrementCount();
		}
		System.out.println();		
	}

}
