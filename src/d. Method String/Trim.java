public class Trim {
    public static void main(String[] args) {
        String str = "Trim digunakan untuk untuk menghapus karakter yang tak bisa dicetak misalnya spasi baris baru, enter, yang ada sebelum atau sesudah suatu kalimat.";
        System.out.println(str + "\n");
        String kalimat = " Mari Kita Pulang  ";
        System.out.println(kalimat.trim());
        String kalimat2 = "        Hello World        ";
        System.out.println(kalimat2.trim());
    }
}
