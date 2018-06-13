/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrorista;

/**
 *
 * @author EdwinLovo
 */
public class Bus implements Terrorista{
    int vida=500,pAta=100;
    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public int getVida() {
        return vida;
    }
    
}
