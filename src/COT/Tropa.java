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
    int vida,Ataque;
    String name;

    public Tropa(int vida, int puntosAtaque, String name) {
        this.vida = vida;
        this.Ataque = puntosAtaque;
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
