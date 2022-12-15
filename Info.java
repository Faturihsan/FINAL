
    public enum Info{
        SEGITIGA (3, 180, "Prisma"),
        PERSEGI(4, 360, "Kubus"),
        PERSEGI_PANJANG(4, 360, "Balok"),
        LINGKARAN(1, 360, "Bola");
    
        int sisi;
        int derajat;
        String model3d;

        Info(int sisi, int derajat, String model3d){
            this.sisi = sisi;
            this.derajat = derajat;
            this.model3d = model3d;
        }

}


//     public static void main(String[] args) {
//         Informasi myInfo = Informasi.SEGITIGA;
//         System.out.println(myInfo.sisi);
//     }
// }
