package tugaspersonal1;
import java.util.Scanner;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class tugaspersonal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		java.util.Scanner input = new java.util.Scanner (System.in);
	
		Random random = new Random();
		int x = random.nextInt(51) + 50;
		double cocok = x/1.1;
		
		BigDecimal nilai = new BigDecimal(cocok).setScale(2, RoundingMode.UP);
		
		String Namauser;
		String Umuruser;
		String Namapasangan;
		String Umurpasangan;
		
		System.out.println("Selamat Datang Di Program Ramalan Coba-Coba");
		System.out.println("*******************************************");
		System.out.println("");
		
		System.out.println("Data Anda :");
		System.out.print("Silahkan input nama anda = ");
		Namauser=input.nextLine();
		System.out.print("Silahkan input umur anda = ");
		Umuruser=input.nextLine();
		System.out.println("");
		
		System.out.println("Data Pasangan Anda :");
		System.out.print("Silahkan input nama pasangan anda = ");
		Namapasangan=input.nextLine();
		System.out.print("Silahkan input umur pasangan anda = ");
		Umurpasangan=input.nextLine();
		System.out.println("");
		
		System.out.println("*******************************************");
		System.out.println(Namauser + " [" + Umuruser + "] Tahun");
	     for(int i=1; i<=2; i++)
	     {
	         for(int k=1; k<=2-i; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*i; j++)
	         {
	             System.out.print("*");
	         } 
	         for(int k=1; k<=2*(2-i+1)-1; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*i; j++)
	         {
	             System.out.print("*");
	         } 
	         System.out.println();
	     }
	     for(int i=1; i<=5; i++)
	     {
	         for(int k=1; k<=i-1; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*(5-i+1)-1; j++)
	         {
	             System.out.print("*");
	         } 
	         System.out.println();
	     }
	    System.out.println( Namapasangan + " [" + Umurpasangan + "] Tahun \n");
		System.out.println("Kecocokan anda dan pasangan adalah = " + nilai + " %");
		System.out.println("*******************************************");
		System.out.println("Terimakasih telah mencoba program ini");
	}

}
