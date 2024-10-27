/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Iñi
 */
public class ProcesosHilos22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Taquilla taquilla = new Taquilla(100);

        try {
            Vendedor carlos = new Vendedor("Carlos", taquilla);
            Vendedor laura = new Vendedor("Laura", taquilla);
            carlos.start();
            laura.start();
            carlos.join();
            laura.join();
            
            //carlos.pasarBoletosEntreHilos(10, laura);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
