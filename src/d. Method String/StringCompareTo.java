public class StringCompareTo {
    public static void main(String[] args) {
        String stringPertama = "Hello World";
        String stringKedua = "Hello Cirebon";
        // mengitung posisi abjad jika sama2 lower/upper
        System.out.println(stringPertama.compareTo(stringKedua));

        // menghitung posisi berdasarkan ASCII jika tidak sama lower/upper nya
        String stringKetiga = "Hello World";
        String stringKeempat = "Hello world";
        System.out.println(stringKetiga.compareTo(stringKeempat));
    }
}
