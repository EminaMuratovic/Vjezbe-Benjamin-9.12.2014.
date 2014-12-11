
public class StudentTest {
	public static void main(String[] args) {
		Shelter sklonisteJedan = new Shelter();
		Shelter sklonisteDva = new Shelter();
		
		sklonisteJedan.addAnimals("Pujdo", "pas");
		sklonisteDva.addAnimals("Cicko", "macka");
		sklonisteJedan.addAnimals("Rex", "pas");
		sklonisteDva.addAnimals("Mrva", "ptica");
		sklonisteJedan.addAnimals("Moli", "ptica");
		sklonisteDva.addAnimals("Pix", "pas");
		
		System.out.println("Skloniste Jedan: \n\n" + sklonisteJedan.toString() );
		System.out.println("Skloniste Dva: \n\n" + sklonisteDva.toString() );
		
		System.out.println(Shelter.ukupnoZivotinja);
}
}