# ABSTRACT, OVERRIDE, OVERLOAD
## 🗂️ Table Of Contents
- [Abstract](https://github.com/adeliafhr/Tugas-Pertemuan-Ketiga/blob/main/Pabrik.java)
- [Override](https://github.com/adeliafhr/Tugas-Pertemuan-Ketiga/blob/main/PerangkatElektronik.java)
- [Overload](https://github.com/adeliafhr/Tugas-Pertemuan-Ketiga/blob/main/Laptop.java)
---
## 🌀 Abstract Class
Abstract class merupakan kelas yang tidak dapat diinstansiasi atau dibuat objeknya secara langsung. Abstract class digunakan sebagai kerangka kerja dasar yang dapat digunakan untuk membuat kelas turunan atau subclass. Abstract class sendiri tidak dapat digunakan untuk membuat objek, namun hanya berfungsi sebagai kerangka kerja untuk kelas turunan yang diturunkan darinya.
### Berikut adalah source code dari abstract class
<pre> 
  public abstract class Pabrik {
    
    abstract void memproduksi();
    
    public void model(){
        System.out.println("aku memiliki model yang banyak");
    }
}
</pre>
Dalam kode ini kita buat class abstract Pabrik dan buat method abstract yaitu memproduksi(); yang tidak dapat di implementasi, namun dapat di implementasi pada subclass. Dalam kode ini kita juga membuat method biasa yaitu model. Metode ini dapat dipanggil oleh objek yang dibuat dari kelas yang mewarisi Pabrik.

---
## ✏️ Override
Method overriding adalah sebuah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class.
### Berikut adalah source code dari method override
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

---    
## 📈 Overload
Method overloading adalah fitur dalam Java yang memungkinkan kita untuk mendefinisikan beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda dalam satu kelas.
### Berikut adalah source code dari method overload
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
- Metode pertama tidak menerima paramater dan memberikan informasi umum tentang kualitas.
- Metode kedua menerima parameter yaitu string yang disebut eksklusif dan memberikan pernyataan tentang kualitas.
- Metode ketiga menerima parameter integer dan memberikan informasi spesifik tentang harga laptop.

---
## 📝 Kesimpulan
- **Abstract Class** digunakan sebagai kerangka dasar yang tidak bisa diinstansiasi namun membutuhkan subclass untuk mengisi perilaku spesifik
- **Override** menggantikan implementasi metode pada superclass di subclass untuk perilaku yang lebih spesifik.
- **Overload** mendefinisikan beberapa metode dengan nama sama tetapi parameter berbeda dan meningkatkan fleksibilitas kode

---
## 💡Semoga README ini membantu dalam pemahaman konsep abstract, override dan overload📖
