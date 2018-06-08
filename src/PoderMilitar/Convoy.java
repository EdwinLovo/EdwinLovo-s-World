/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoderMilitar;

import Militar.Militar;
import Singletons.Fase;

/**
 *
 * @author EdwinLovo
 */
public class Convoy implements Militar{
    int vida=500;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void atacar() {
        System.out.println("Atacar");
    }

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void crear(int r1, int r2, int r3) {
    }

}
