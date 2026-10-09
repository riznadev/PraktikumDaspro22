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
    System.out.print("PKM, "  );
    System.out.println("dan lainnya:");
    lomba = input.nextLine();


    if (lomba .equalsIgnoreCase("BELMAWA") ||lomba .equalsIgnoreCase("BAKORMA") ||lomba .equalsIgnoreCase("Mandiri")) {
        System.out.println("masukan peringkat juara : ");
        peringkat = input.nextInt(); 
        if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
            System.out.println("Masukkan jumlah dokumen :");
            doc = input.nextInt();

            if(doc < 4){
                System.out.println("Dokumen anda kurang "+ (4 - doc) + " dokumen . dana penghargaan tidak diberikan " );
            } else {
                System.out.println("anda berhak mendapatkan Dana Penghargaan");
            }
            

        }else {
            System.out.println("Masukkan jumlah dokumen :");
            doc = input.nextInt();

            if(doc < 4){
                System.out.println("Anda belum berhak mendapatkan Dana Penghargaan" );
            } else {
                System.out.println("anda belum berhak mendapatkan Dana Penghargaan");
            }
        }
    } else if (lomba .equalsIgnoreCase("PKM")) {
        System.out.println("apakah tim lolos pendanaan ? (y/n)");
        yn = input.nextLine();
        if (yn .equalsIgnoreCase("y")){
            // System.out.println("sip oleh pendanaan, berhak oleh dana penghargaan");
                System.out.println("Masukan jumlah dokumen yang telah di Input ke Siakad : ");
                doc = input.nextInt();

                 if(doc < 4){
                System.out.println("Dokumen anda kurang "+ (4 - doc) + "dokumen . dana penghargaan tidak diberikan " );
                } else {
                System.out.println("anda berhak mendapatkan Dana Penghargaan");
                }

        } else {
             System.out.println("Masukkan jumlah dokumen :");
            doc = input.nextInt();

            if(doc < 4){
                System.out.println("Anda belum berhak mendapatkan Dana Penghargaan" );
            } else {
                System.out.println("anda belum berhak mendapatkan Dana Penghargaan");
            }
        }

    } else {
        System.out.println("masukan peringkat juara : ");
        peringkat = input.nextInt(); 
        if (peringkat == 1 || peringkat == 2 || peringkat == 3) {
            System.out.println("Masukkan jumlah dokumen :");
            doc = input.nextInt();

            if(doc < 4){
                System.out.println("Dokumen anda kurang "+ (4 - doc) + "dokumen . dana penghargaan tidak diberikan " );
            } else {
                System.out.println("Jenis lomba tidak didukung. dana penghargaan tidak diberikan");
            }
            

        }else {
            System.out.println("Masukkan jumlah dokumen :");
            doc = input.nextInt();

            if(doc < 4){
                System.out.println("Jenis lomba tidak didukung. dana penghargaan tidak diberikan" );
            } else {
                System.out.println("Jenis lomba tidak didukung. dana penghargaan tidak diberikan");
            }
        }
    }
}    
}
