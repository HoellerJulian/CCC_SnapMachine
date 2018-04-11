import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int betrag =Integer.parseInt(args[0]);
		int anzahlMuenzen =Integer.parseInt(args[1]);
		int[] muenzen =new int[anzahlMuenzen];
		int input = 0;
		for (int n = 0; n <anzahlMuenzen; n++) {
			int offset=2;
			muenzen[n]= Integer.parseInt(args[offset+n]);
			betrag-=muenzen[n];
			
		}
		if(betrag<0) {System.out.println("CHANGE "+betrag*(-1));}
		else if(betrag==0) {}
		else if(betrag>0) {System.out.println("MISSING "+betrag);}
	}

}
