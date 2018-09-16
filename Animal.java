
public class Animal implements Comparable <Animal> {
	private String names;
	private int legs;
	
	Animal(String names, int legs){
		this.names=names;
		this.legs=legs;
	}
	
	@Override
	public int compareTo(Animal animal) {
		return getnames().compareTo(animal.getnames());
	}
	
	public String getnames() {
		return names;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setnames(String names) {
			this.names=names;
	}
	
	public void setLegs(int legs) {
		this.legs=legs;
	}
	
	public String toString() {
		return "dognames: "+ getnames()+" legsnumber: " +getLegs();
	}


}
