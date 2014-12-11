
public class Shelter {
	private Zivotinje[] animals;
	private int numAnimals;
	public static int ukupnoZivotinja = 0;
	/**
	 * creates an object without parameters, makes default parameters
	 */
	public Shelter() {
		animals = new Zivotinje[2];
		numAnimals = 0;
	}
	/**
	 * adds an animal into the shelter with all of the parameters
	 * @param name String name of the animal
	 * @param type String type of the animal
	 * @param numLegs int number of legs
	 */
	public void addAnimals(String name, String type, int numLegs) {
		animals[numAnimals] = new Zivotinje(name, type, numLegs);
		numAnimals++;
		ukupnoZivotinja++;
		if(numAnimals == animals.length) {
			resizeAnimals();
		}
	}
	/**
	 * resizes the array where the animals are placed
	 */
	public void resizeAnimals() {
		int newLength = 2 * animals.length;
		Zivotinje[] temp = new Zivotinje[newLength];
		for(int i = 0; i < animals.length; i++) {
			temp[i] = animals[i];
		}
		animals = temp;
	}
	/**
	 * takes the number of all animals in every shelter together
	 * @return number of all animals
	 */
	public int getUkupnoZivotinja()
	{
		return ukupnoZivotinja;
	}
	
	/**
	 * adds an animal into the shelter with two parameters
	 * @param name String name of the animal
	 * @param type String type of the animal
	 */
	public void addAnimals(String name, String type) {
		addAnimals(name, type, 5);
	}
	
	public String  toString() {
		String str = "";
		for(int i = 0; i < numAnimals; i++)
			str += animals[i].toString();
		return str;
	}
	
	
}
