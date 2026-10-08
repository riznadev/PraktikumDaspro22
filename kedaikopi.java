import java.util.Scanner;
public class kedaikopi {
public static void main(String [] args)  {
    Scanner input = new Scanner(System.in);
    
    int hargapercup =18000;
    int jumlahcup ;
    double total_harga, uangbayar, diskon, totalbayar, kembalian, kurang ;

    System.out.println("Masukan jumlah Cup : ");
    jumlahcup = input.nextInt();
    System.out.println("Masukan uang pembayar : ");
    uangbayar = input.nextInt();

    total_harga =jumlahcup * hargapercup ;
    diskon = 0;
    System.out.println("total harga : " + total_harga);

    if (total_harga >= 100000) {
        diskon = total_harga * 0.10;
    } 

    totalbayar = total_harga - diskon;

    System.out.println("total harga : " + total_harga);
    System.out.println("total diskon : " + diskon);
    System.out.println("total bayar : " + totalbayar);

    if (uangbayar >= totalbayar) {
        kembalian = uangbayar - totalbayar;
        System.out.println("kembalian : " + kembalian);
    }else {
        kurang = totalbayar - uangbayar;
        System.out.println("uang tidak cukup, kurang Rp." +kurang);
    }
    
}
    
}