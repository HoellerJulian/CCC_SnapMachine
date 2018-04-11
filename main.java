import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int betrag =Integer.parseInt(args[0]);
		int anzahlMuenzen =Integer.parseInt(args[1]);
		int[] muenzen =new int[anzahlMuenzen];
		int input = 0;
		for (int n = 0; n <anzahlMuenzen; n++) {
			int offset=2;
			muenzen[n]= Integer.parseInt(args[offset+n]);
			input=sc.nextInt();
			betrag-=input;
			System.out.println(betrag);
		}
		
	}

}
