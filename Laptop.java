/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class Laptop extends PerangkatElektronik {
    private int ram;
    
    public Laptop(){
        System.out.println("aku adalah laptop");
        super.memproduksi();
    }
    
    public void quality(){
        System.out.println("kualitas laptop tergantung dari harga");
    }
    
    public void quality(String eksklusif){
        System.out.println("laptop ini berkualitas");
    }
    
    public String quality(int rupiah){
        return "laptop ini dibeli dengan harga " + String.valueOf(rupiah) + " rupiah ";
    }
    
    @Override
    public void model(){
        System.out.println("laptop ini memiliki model yang bagus");
    }
    

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }
}
