package tugaspersonal;
import java.util.Scanner;
public class tugaspersonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner (System.in);
		
		String Nama;
		String Namabarang;
		String Jumlahbarang;
		String Hargabeli;
		String Hargajual;
		
		System.out.print("Silahkan input nama anda = ");
		Nama=input.nextLine();
		System.out.println("Stock Gudang Input Barang ");
		System.out.println("=========================== ");
		System.out.println("Selamat Datang " + Nama);
		System.out.print("Input Nama Barang = ");
		Namabarang=input.nextLine();
		System.out.print("Input Jumlah Barang = ");
		Jumlahbarang=input.nextLine();
		System.out.print("Input Harga Beli Barang = ");
		Hargabeli=input.nextLine();
		System.out.print("Input Harga Jual Barang = ");
		Hargajual=input.nextLine();
			
		System.out.println("=========================== ");
		System.out.println("Stock Gudang Rincian Barang ");
		System.out.println("=========================== ");
		System.out.println("Nama Barang		: " + Namabarang);
		System.out.println("Jumlah Barang		: " + Jumlahbarang);
		System.out.println("Harga Beli Barang	: Rp.  " + Hargabeli);
		System.out.println("Harga Jual Barang	: Rp.  " + Hargajual);
		System.out.println("============================== ");
		
				
	}

}
