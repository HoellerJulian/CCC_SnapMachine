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
		int[]num = new int[8];
		for (int i = 0; i < num.length; i++) {
			num[i]=0;
		}
		while(betrag>0) {
		if(betrag-200>-1) {betrag-=200;num[07]+=1;}
		else if(betrag-100>-1) {betrag-=100;num[06]+=1;}
		else if(betrag-50>-1) {betrag-=50;num[05]+=1;}
		else if(betrag-20>-1) {betrag-=20;num[04]+=1;}
		else if(betrag-10>-1) {betrag-=10;num[03]+=1;}
		else if(betrag-5>-1) {betrag-=5;num[02]+=1;}
		else if(betrag-2>-1) {betrag-=2;num[01]+=1;}
		else {betrag-=1;num[00]+=1;}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" "+num[i]);
		}
	}

}
