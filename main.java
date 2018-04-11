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
		if(betrag<0) {
		System.out.print("CHANGE");
		returncmd(betrag*(-1));
		
		}
		else if(betrag==0) {}
		else if(betrag>0) {System.out.println("MISSING "+betrag);}
	}
	
	static protected void returncmd(int betrag) {
		while(betrag>0) {
		if(betrag-200>-1) {betrag-=200;System.out.print(" 200");}
		else if(betrag-100>-1) {betrag-=100;System.out.print(" 100");}
		else if(betrag-50>-1) {betrag-=50;System.out.print(" 50");}
		else if(betrag-20>-1) {betrag-=20;System.out.print(" 20");}
		else if(betrag-10>-1) {betrag-=10;System.out.print(" 10");}
		else if(betrag-5>-1) {betrag-=5;System.out.print(" 5");}
		else if(betrag-2>-1) {betrag-=2;System.out.print(" 2");}
		else {betrag-=1;System.out.print(" 1");}
		}
	}

}
