
public abstract class Animal implements Countable {
	
	private int count;
	
	public Animal() {
		count = 1;
	}
	
	public Animal(int count) {
		setCount(count);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void incrementCount() {
		count++;
		
	}

	@Override
	public void resetCount() {
		count = 1;
		
	}

	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
