import java.util.Scanner;
public class compito26ottobre {
	public static void main(String[] args) {
		Scanner tastiera=new Scanner(System.in);
		MyDate md = new MyDate();
		int giorno;
		int mese;
		int anno;
		String formato;
	    System.out.println("inserisci il giorno:");
	    giorno=tastiera.nextInt();
	    System.out.println("inserisci il mese:");
	    mese=tastiera.nextInt();
	    System.out.println("inserisci il anno:");
	    anno=tastiera.nextInt();
	    System.out.println("se vui la data in stile inglse digita 'en'");
	    formato=tastiera.nextLine();
		md.setMese(mese);
	    md.setGiorno(giorno);
	    md.setAnno(anno);
	    System.out.println(md);
	    
	}
}