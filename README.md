# ABSTRACT, OVVERRIDE, OVERLOAD
## Abstract 
Abstract dalam Java adalah salah satu fitur penting dalam pemrograman berorientasi objek (OOP). Konsep ini memungkinkan Anda untuk mendefinisikan kelas dan metode yang tidak diimplementasikan secara langsung dan memberikan kerangka kerja untuk kelas turunan.
## Apa itu abstract class? 
Abstract class merupakan kelas yang tidak dapat diinstansiasi atau dibuat objeknya secara langsung. Abstract class digunakan sebagai kerangka kerja dasar yang dapat digunakan untuk membuat kelas turunan atau subclass. Abstract class sendiri tidak dapat digunakan untuk membuat objek, namun hanya berfungsi sebagai kerangka kerja untuk kelas turunan yang diturunkan darinya.
## Berikut adalah source code dari abstract class
<pre> 
  public abstract class Pabrik {
    
    abstract void memproduksi();
    
    public void model(){
        System.out.println("aku memiliki model yang banyak");
    }
}
</pre>
Dalam kode ini kita buat class abstract Pabrik dan buat method abstract yaitu memproduksi(); yang tidak dapat di implementasi, namun dapat di implementasi pada subclass. Dalam kode ini kita juga membuat method biasa yaitu model. Metode ini dapat dipanggil oleh objek yang dibuat dari kelas yang mewarisi Pabrik.

## Override
Method overriding adalah sebuah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class.
## Berikut adalah source code dari method override
<pre>
 public class PerangkatElektronik extends Pabrik {
    private String merek;
  
    public PerangkatElektronik(){
        System.out.println("halo aku perangkat elektronik");
        super.model();
    }
    
    @Override
    public void model(){
        System.out.println("aku memiliki berbagai model");
    
    @Override
    void memproduksi(){
        System.out.println("pabrik memproduksi alat elektronik yaitu aku");
    }
</pre>
Kelas ini bernama PerangkatElektronik dan merupakan subclass dari kelas Pabrik. Ini berarti PerangkatElektronik mewarisi semua metode dan atribut dari kelas Pabrik. Pada kelas ini juga terdapat konstruktor maka setiap kali objek dari kelas ini dibuat, pesan "halo aku perangkat elektronik" akan dicetak. Setelah itu, konstruktor memanggil metode model() dari kelas induk (Pabrik) menggunakan super.model(). Ini akan mencetak pesan dari metode model() di kelas Pabrik, yaitu "aku memiliki model yang banyak". 
<br> Dalam kode ini kita mengoverride metode model() yang diwarisi dari kelas Pabrik. Metode ini sekarang mencetak pesan "aku memiliki berbagai model". Ini menggantikan implementasi dari kelas induk. Kita juga mengoverride metode abstrak memproduksi() dari kelas Pabrik. Metode ini sekarang memberikan implementasi yang spesifik untuk kelas PerangkatElektronik, mencetak pesan yang menjelaskan bahwa pabrik memproduksi alat elektronik.
<br> <br> kita juga mengoverride method model pada class laptop, berikut source code dari laptop yang terdapat override  <pre> 
  public class Laptop extends PerangkatElektronik {
   @Override
    public void model(){
        System.out.println("laptop ini memiliki model yang bagus");
    }
</pre>
    
## Overload
Method overloading adalah fitur dalam Java yang memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu kelas.
## Berikut adalah source code dari method overload
<pre>
  public void quality(){
        System.out.println("kualitas laptop tergantung dari harga");
    }
    
    public void quality(String eksklusif){
        System.out.println("laptop ini berkualitas");
    }
    
    public String quality(int rupiah){
        return "laptop ini dibeli dengan harga " + String.valueOf(rupiah) + " rupiah ";
    }
</pre>
Di dalam kode ini, terdapat tiga metode dengan nama yang sama, yaitu quality, yang menunjukkan method overloading. Setiap metode memiliki parameter yang berbeda, sehingga mereka dapat melakukan tugas yang berbeda:
<br> Metode pertama memberikan informasi umum tentang kualitas.
<br> Metode kedua memberikan pernyataan tentang kualitas tanpa memberikan detail lebih lanjut.
<br> Metode ketiga memberikan informasi spesifik tentang harga laptop.
<br> Dengan cara ini, kita bisa menggunakan nama metode yang sama tetapi mendapatkan perilaku yang berbeda sesuai dengan argumen yang diberikan.

## Class utama
Pada class utama kita akan menjalankan seluruh program yang sudah kita implementasikan pada class yang kita buat
<pre>
  public static void main(String[] args) {
        //buat objek dari laptop dan simpan dalam variabel asus
        Laptop asus = new Laptop(); 
       //override
        asus.model();
        //overload
        asus.quality();
        asus.quality("laptop eksklusif");
        System.out.println(asus.quality(30000));
</pre>
Ouput : 
<pre> 
halo aku perangkat elektronik
aku memiliki model yang banyak
aku adalah laptop
pabrik memproduksi alat elektronik yaitu aku
laptop ini memiliki model yang bagus
kualitas laptop tergantung dari harga
laptop ini berkualitas
laptop ini dibeli dengan harga 30000 rupiah 
</pre>
