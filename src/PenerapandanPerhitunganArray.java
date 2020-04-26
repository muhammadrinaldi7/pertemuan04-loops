import java.util.Scanner;

public class PenerapandanPerhitunganArray {

        public static void main(String[] args) {
            int i,jumlah=0;

            long npm;
            int[] nilai = new int[5];
            String nama;
            String mk[] = {"P. Visual 2","PBO 1","Jaringan Komputer","P. Web 2","Perancangan Database"};
            Scanner input = new Scanner (System.in);

            System.out.println("\t           Pengimputan nilai mahasisiwa");
            System.out.println("\t Universitas Islam Kalimantan Muhammad Arsyad Al-Banjary");
            System.out.println("   =======================================================");
            System.out.print("Nama\t:");
            nama=input.nextLine();
            System.out.print("NPM\t:");
            npm=input.nextLong();

            for (i=0;i<5;i++)
            {
                System.out.print("input nilai "+mk[i]+": ");
                nilai[i]=input.nextInt();
                jumlah=jumlah+nilai[i];

            }
            float rata=(float) jumlah/i;
            System.out.println("=================================================");
            System.out.println("Jumlah nilai\t\t:"+jumlah);
            System.out.print("Nilai rata-rata\t\t:"+rata);



        }

    }


