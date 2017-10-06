package tn.dauphine.javaavance;

import java.util.ArrayList;
import java.util.Random;
public class PrimeCollection {
	//private int liste[];
	ArrayList<Integer> liste;
	PrimeCollection(){
		liste=new ArrayList<Integer>();
	}
	public void initRandom(int n, int m) {
		//liste=new int[n];
		 Random randomGenerator = new Random();
		for(int i=0; i<n/*liste.length*/;i++) {
			int val= randomGenerator.nextInt(m);
			liste.add(val);
			 System.out.print(" " + val);
		}
		System.out.println();
	}

	private boolean isPrime(int p) {
		boolean result=true;
		if(p!=1&&p!=0)
			{for(int i=2; i<=Math.sqrt(p);i++)
		{
			if(p%i==0)
			{
				result=false;
				break;
			}
		}
		
		return result;}
		else return false;
	}
	/*void printPrimes() {
		for(int i=0; i<liste.length;i++) {
			if(isPrime(liste[i]))
				 System.out.println("premier : " + liste[i]);
		}
	}*/
	void printPrimes() {
		for(Integer i:liste) {
			if(isPrime(i))
				 System.out.println("premier : " + i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");
		PrimeCollection pc=new PrimeCollection();
		pc.initRandom(20,2000);
		pc.printPrimes();
		

	}

}
