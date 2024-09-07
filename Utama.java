/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanketiga;

/**
 *
 * @author Lenovo
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop asus = new Laptop();
       //override
        asus.model();
        //overload
        asus.quality();
        asus.quality("laptop eksklusif");
        System.out.println(asus.quality(30000));
        System.out.println("-------------------------------");
        Handphone oppo = new Handphone();
        //override
        oppo.model();
        //overload
        oppo.quality();
        oppo.quality("handphone ekslusif");
        System.out.println(oppo.quality(10000));

    }
}
