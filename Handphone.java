/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class Handphone extends PerangkatElektronik {
    private String warna;
    
    public Handphone(){
        System.out.println("aku adalah handphone");
        super.memproduksi();
    }

    public void quality(){
        System.out.println("kualitas handphone tergantung dari harga");
    }
    
    public void quality(String eksklusif){
        System.out.println("handphone ini berkualitas");
    }
    
    public String quality(int rupiah){
        return "handphone ini dibeli dengan harga " + String.valueOf(rupiah) + " rupiah ";
    }
    
    @Override
    public void model(){
        System.out.println("handphone ini memiliki model yang estetik");
    }
    
    
    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }
}

