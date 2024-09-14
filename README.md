# ABSTRACT, OVVERRIDE, OVERLOAD
## Abstract 
Abstract dalam Java adalah salah satu fitur penting dalam pemrograman berorientasi objek (OOP). Konsep ini memungkinkan Anda untuk mendefinisikan kelas dan metode yang tidak diimplementasikan secara langsung, memberikan kerangka kerja untuk kelas turunan.
## Apa itu abstract class? 
Abstract class merupakan kelas yang tidak dapat diinstansiasi atau dibuat objeknya secara langsung. Abstract class digunakan sebagai kerangka kerja dasar yang dapat digunakan untuk membuat kelas turunan atau subclass. Abstract class sendiri tidak dapat digunakan untuk membuat objek, namun hanya berfungsi sebagai kerangka kerja atau blueprint untuk kelas turunan yang diturunkan darinya.
## Berikut adalah source code dari abstract class
<pre> 
  public abstract class Pabrik {
    
    abstract void memproduksi();
    
    public void model(){
        System.out.println("aku memiliki model yang banyak");
    }
}
</pre>
Dalam kode ini kita buat class abstract Pabrik dan buat method abstract yaitu memproduksi(); yang tidak dapat di implementasi, namun dapat di implementasi pada subclass. Dalam kode ini kita juga nenbuat method biasa yaitu model. Metode ini dapat dipanggil oleh objek yang dibuat dari kelas yang mewarisi Pabrik.

## Override
Method overriding adalah sebuah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class.
## Berikut adalah source code dari method override
<pre>
 public class PerangkatElektronik extends Pabrik {
   
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
