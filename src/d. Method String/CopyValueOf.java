public class CopyValueOf {
    public static void main(String[] args) {
        // Metode copyValueOf()ini digunakan untuk menyalin keseluruhan array (data) ke string.  Intinya yang perlu diperhatikan di sini adalah bahwa metode ini tidak menambahkan konten/ menggantikan nilai dalam String. 
        String str = "Hello World";
		char[] arr = {'H','e','l','l','o',' ','J','a','v','a','a'};
		System.out.println(str.copyValueOf(arr));
    }
}
