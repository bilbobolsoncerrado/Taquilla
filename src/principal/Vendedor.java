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
public class Vendedor extends Thread{
    
    private String name;
    private Taquilla taquilla;
  //  private String[] quienVende=new String[50];
    
    public Vendedor(String name, Taquilla taquilla){
        this.name = name;
        this.taquilla = taquilla;
        System.out.println("El vendedor es: " + name + " y " + " tiene " + taquilla.getEntrada() + " entradas.");
        //this.start();
    }
    
    public void run(){
        for(int i = 0; i < 50; i++){
        	System.out.println("El vendedor es: " + name);
            boolean hayEntradas=taquilla.venderEntrada(10);
            
            //System.out.println("El vendedor es: " + name + " y, despues de vender le quedan " + taquilla.getEntrada() + " entradas.");
            if (!hayEntradas)
            	break;
        }
    }
    
    public synchronized void pasarBoletosEntreHilos(int boleto, Vendedor otroVendedor){
        taquilla.venderEntrada(boleto);
        otroVendedor.taquilla.venderEntrada(boleto);
        
    }
    
}
