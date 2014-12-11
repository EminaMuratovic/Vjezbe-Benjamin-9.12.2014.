
public class Zivotinje {
	private String name;
	private String type;
	private int numLegs;
	// konstruktori:
	/**
	 * creates an object without parameters, makes default parameters
	 */
	public Zivotinje() {
		this("nepoznato", "nepoznato", 0);
	}
	/**
	 * creates an object with all of the parameters
	 * @param name String name of the animal
	 * @param type String type of the animal
	 * @param numLegs int number of legs
	 */
	public Zivotinje(String name, String type, int numLegs) {
		this.name = name;
		this.type = type;
		this.numLegs = numLegs;
	}
	/**
	 * creates an object with only two parameters: name and a type of the animal
	 * @param name String name of the animal
	 * @param type String type of the animal
	 */
	public Zivotinje(String name, String type) {
		this.name = name;
		this.type = type;
		this.setNumLegs(5);
	}
	//kontruktor kopije:
	/**
	 * copies one object to another
	 * @param other Zivotinje object the we want to copy
	 */
	public Zivotinje(Zivotinje other) {
		this.name = other.name;
		this.type = other.type;
		this.numLegs = other.numLegs;
	} 
	//pretvaranje u string:
	/**
	 * returns a string representation of the object
	 */	
	public String toString() {
		String str = "";
		str = "Name: " + name + "\nType: " + type + "\nNumber of legs: " + numLegs + "\n";
		return str;
	}
	//geteri:
	/**
	 * gets the name of the animal
	 * @return name of the animal
	 */
	public String getName() {
		return name;
	}
	/**
	 * gets the type of the animal
	 * @return type of the animal
	 */
	public String getType() {
		return type;
	}
	/**
	 * gets the number of the legs
	 * @return number of the legs
	 */
	public int getNumLegs() {
		return numLegs;
	}
/**
 * sets the name of the animal
 * @param name String name of the animal
 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * sets type of the animal 
	 * @param type String type of the animal
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * sets the number of legs of the animal considering the type
	 * @param numLegs int number of legs
	 */
	public void setNumLegs(int numLegs) {
		this.type = type.toLowerCase();
		
		if(type.equals("macka") || type.equals("pas") || type.equals("konj"))
		{
			if(numLegs > 4) 	
				this.numLegs = 4;		
			else if(numLegs < 1) 
				this.numLegs = 4;
			else 
				this.numLegs = numLegs;		
		}
		if(type.equals("riba"))
		{
			if(numLegs > 0 || numLegs < 0)
				this.numLegs = 0;
			else 
				this.numLegs = numLegs;
		}
		if(type.equals("ptica")) {
			if(numLegs > 2)
				this.numLegs = 2;
			if(numLegs < 1)
				this.numLegs = 2;
			else 
				this.numLegs = numLegs;
		}
		
		
	}

}
