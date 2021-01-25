public class IndexOf {
    public static void main(String[] args) {
        String str = "Hello World";
        // mencari nilai index pada karakter
        // jika karakter lebih dari 1, karakter pertama yg dicari
        System.out.println(str.indexOf("el"));
        System.out.println(str.indexOf("orl"));
        System.out.println(str.indexOf("l"));
        // jika tidak ketemu hasilnya -1
        System.out.println(str.indexOf("z"));
    }
}
