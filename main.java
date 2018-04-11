import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int betrag =gridlog(args[0]);
		int[] muenzen =new int[args.length-1];
		int offset=1;
		for (int n = 0; n <args.length-offset; n++) {
		
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
	static protected int gridlog(String argsnull) {
		int[][] grid= new int[26][26];
		grid[0][0]=79;
		grid[0][1]=99;
		grid[0][2]=149;
		grid[1][0]=65;
		grid[1][1]=129;
		grid[1][2]=199;
		String[] preset=new String[2];
		preset[0]=argsnull.substring(0, 1);
		preset[1]=argsnull.substring(1);
		switch (preset[0]) {
		case "A":
			return grid[Integer.parseInt(preset[1])-1][0];
		case "B":
			return grid[Integer.parseInt(preset[1])-1][1];
		case "C":
			return grid[Integer.parseInt(preset[1])-1][2];
		default:
			return 0;
		}
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
