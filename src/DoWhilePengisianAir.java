public class DoWhilePengisianAir {
    public static void main(String[]args) {
        int isigelas = 0;
        int penuh = 225;

        System.out.println("Isi Gelas Sekarang : " + isigelas + "m1");
        System.out.println("Isi Gelas Ketika Penuh : " + penuh + "m1");

        do {
            isigelas++;
            System.out.println("Sedang mengisi gelas...");
            System.out.println("Isi Gelas Sekarang : " + isigelas + "m1");
        } while (isigelas != penuh);
        System.out.println("Finale: Isi Gelas Sekarang : " + isigelas + "m1");
    }
}
