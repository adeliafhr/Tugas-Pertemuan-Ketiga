/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class PerangkatElektronik extends Pabrik {
    private String merek;
   
    public PerangkatElektronik(){
        System.out.println("halo aku perangkat elektronik");
        super.model();
    }
    
    @Override
    public void model(){
        System.out.println("aku memiliki berbagai model");
    }
    
    @Override
    void memproduksi(){
        System.out.println("pabrik memproduksi alat elektronik yaitu aku");
    }
    
    /**
     * @return the merek
     */
    public String getMerek() {
        return merek;
    }

    /**
     * @param merek the merek to set
     */
    public void setMerek(String merek) {
        this.merek = merek;
    }
}
