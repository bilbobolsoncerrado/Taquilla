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
public class Taquilla {
    
    private int entrada;
    
    public Taquilla(int entrada){
        this.entrada = entrada;
    }
    
    public synchronized boolean venderEntrada(int entrada){
    	if(this.entrada -entrada < 0)
    	{
            System.out.println("La taquilla ya no dispone de entradas.");
            return false;
    	}
    	this.entrada-= entrada;
    	System.out.println("vendidas "+entrada+ " entradas");
    	return true;
    }

    public synchronized int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    
    
}
