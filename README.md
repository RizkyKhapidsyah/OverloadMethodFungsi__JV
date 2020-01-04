# OverloadMethodFungsi__JV
Bahan Ajar Fundamental Pemrograman Java. Mengenal Method Overload Fungsi Pada Pemrograman Java.<br><br>
<img src="https://github.com/RizkyKhapidsyah/OverloadMethodFungsi__JV/blob/master/results/001.PNG"></a><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/OverloadMethodFungsi__JV/blob/master/src/com/rizkykhapidsyah/omf/Main.java">Source Code.</a><br><br>

# Java-Method overloading

Method overloading artinya method dengan nama yang sama, namun memiliki parameter yang berbeda, dan method ini berada dalam sebuah class yang sama atau bisa juga berada dalam class yang lain yang terkait dalam hirarki inheritance.

Method overloading terjadi bila dalam satu class memiliki method dengan nama yang sama namun memiliki parameter yang berbeda.
Belajar Java Pemula Method Overloading. Bila kita hanya perlu melakukan hanya satu operasi, maka memiliki nama method yang sama akan meningkatkan pembacaan program. Misalnya untuk melakukan perkalian terhadap angka yang diberikan, namun memiliki beberapa angka berbeda sebagai argumen, bila method ditulis seperti x(int,int) untuk dua parameter, dan z(int,int,int) untuk tiga parameter, maka akan menyulitkan kita atau programmer lainnya untuk mengerti tugas dari method tersebut, karena memiliki nama yang berbeda. Jadi tujuan utama method overloading adalah untuk memudahkan pembacaan program dengan cepat.

Ada dua cara untuk melakukan overload method :

- Dengan mengganti jumlah argumen
- Dengan mengganti tipe data

Contoh:

Method overloading dengan tipe parameter yang berbeda :

      public class PerkalianKu {

       void perkalian(int a, int b){
        System.out.println(a * b);
       }

       void perkalian(double a, double b){
        System.out.println(a * b);
       }

       public static void main(String args []){

        PerkalianKu objek = new PerkalianKu();

        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
       }
      }


-----
Referensi Artikel: <a href="http://bahasajava.com/">BahasaJava.com</a>. Thanks to: <a href="http://bahasajava.com/">BahasaJava.com</a>.<br>
Referensi Source Code: <a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
