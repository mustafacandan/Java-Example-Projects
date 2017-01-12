import java.util.Scanner;

public class Emlak {
	private String evTipi;
	private String il;
	private int odaSayisi;
	private double fiyat;

	
	public String getEvTipi() {
		return evTipi;
	}
	public void setEvTipi(String evTipi) {
		this.evTipi = evTipi;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public int getOdaSayisi() {
		return odaSayisi;
	}
	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	Emlak(String evTipi, String il, int odaSayisi, double fiyat){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ev Tipi:");
		this.evTipi = input.next();
		
		System.out.print("il:");
		this.il = input.next();
		
		System.out.print("Oda Sayisi:");
		this.odaSayisi = input.nextInt();

		System.out.print("Fiyat:");
		this.fiyat = input.nextInt();
	

	}
	
	public void listeleEmlak(){
		System.out.println("\nEv Tipi :" +evTipi + "\nIl :" + il +"\nOda Sayisi :" + odaSayisi + "\nFiyat :" +fiyat+" TL");
	};
	
	
	
	public String toString(){
		return evTipi +" "+ il +" "+ odaSayisi + " "+ fiyat;
		
	}

}
