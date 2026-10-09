import java.util.Scanner;
public class danapenghargaan {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    String nama, lomba, yn = "-" ;
    int doc = 0, peringkat = 0, kdoc = 0;



   System.out.println("masukan Nama anda : ");
   nama = input.nextLine();

    System.out.println("Jenis kegiatan : ");
    System.out.print("BELMAWA, ");
    System.out.print("BAKORMA, ");
    System.out.print("Mandiri, ");
    System.out.print("dan PKM :"  );
    lomba = input.nextLine();


    if (lomba .equalsIgnoreCase("BELMAWA") ||lomba .equalsIgnoreCase("BAKORMA") ||lomba .equalsIgnoreCase("Mandiri")) {
        System.out.println("masukan peringkat juara : ");
        peringkat = input.nextInt(); 
        if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
            // System.out.println("anda berhak mendapatkan Dana Penghargaan");
            System.out.println("Masukan jumlah dokumen yang telah di Input ke Siakad : ");
            doc = input.nextInt();

        }else {
            System.out.println("anda belum berkesempatan mendapatkan dana Penghargaan");
        }
    } else if (lomba .equalsIgnoreCase("PKM")) {
        System.out.println("apakah tim lolos pendanaan ? (y/n)");
        yn = input.nextLine();
        if (yn .equalsIgnoreCase("y")){
            // System.out.println("sip oleh pendanaan, berhak oleh dana penghargaan");
                System.out.println("Masukan jumlah dokumen yang telah di Input ke Siakad : ");
                doc = input.nextInt();

        } else {
            System.out.println("Gaak oleh pendanaan kon cak, yopo seh");
        }

    } else {
        System.out.println("lomba tidak terdaftar");
    }


    System.out.println("_STATUS PESERTA_");
    System.out.println("Nama : " + nama );
    System.out.println("Jenis Lomba : " + lomba);
    System.out.println("Upload Doc : " + doc);
    System.out.println("Peringkat Juara : " + peringkat);
    System.out.println("Pendanaan PKM : " + yn);

    kdoc = 4 - doc;
    if(doc < 4 ){
        System.out.println("Dokumen anda kurang "+ kdoc );
    }

    
 





}    
}
