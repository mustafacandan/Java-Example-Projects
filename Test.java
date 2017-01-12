import java.util.ArrayList;
import java.util.Scanner;

public class Test {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

	
	String evTipi = null;
	String il = null;
	int odaSayisi = 0;
	double fiyat = 0;
	int total = 0;
	ArrayList<Emlak> envanter = new ArrayList<>();
	
	while(true){
		
		System.out.print("\n1-Ekle \n2-Listele \n3-Cik \nSecenek:");
		int secenek = input.nextInt();
		
		if(secenek == 1){
			
			Emlak emlak1 = new Emlak(evTipi, il, odaSayisi, fiyat);

			envanter.add(emlak1);

			
		} else if (secenek == 2){
		System.out.println("--------------------------------------");
			
			//portfoyu toplama ve envanteri listeleme
		System.out.println("Envanter:");
			for (int i = 0; i < envanter.size(); i++) {
				total += envanter.get(i).getFiyat();
				envanter.get(i).listeleEmlak();
			}

			System.out.println("\nToplam Emlak Portfoyu:" + total+" TL");
			System.out.println("Toplam Emlak Sayisi: "+ envanter.size());

			
		
		} else if (secenek == 3){
			System.out.println("Yine bekleriz..");
			break;
			
		}
			}
			
		
	
	}

	
}
