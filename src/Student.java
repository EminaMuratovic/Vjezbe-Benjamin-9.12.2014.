
public class Student {
	private String imePrezime;
	private double prosjek;
	private int brIndexa;
	private Datum datRodjenja;
	private Datum datUpisa;
	private static int brStudenta = 0;
	//konstruktori: 
	public Student() {
		this("John Doe", new Datum(), new Datum());
		
	}
	public Student(String imePrezime, Datum datRodjenja, Datum datUpisa) {
		this.imePrezime = imePrezime;
		this.datRodjenja = datRodjenja;
		this.datUpisa = datUpisa;
		this.prosjek = 0;
		brStudenta++;
		this.brIndexa = brStudenta;	
	}
	//kontruktor kopije:
	public Student(Student other) {
		this.imePrezime = other.imePrezime;
		this.datRodjenja = other.datRodjenja;
		this.datUpisa = other.datUpisa;
		this.brIndexa = other.brIndexa;
	}

}
