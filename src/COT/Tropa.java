/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COT;

/**
 *
 * @author EdwinLovo
 */
public class Tropa {
    int vida,puntosAtaque;
    String name;

    public Tropa(int vida, int puntosAtaque, String name) {
        this.vida = vida;
        this.puntosAtaque = puntosAtaque;
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
