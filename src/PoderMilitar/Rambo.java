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
public class Rambo implements Militar{

    @Override
    public void atacar() {
        System.out.println("Atacar");
    }

    @Override
    public int recolectar(Fase fase) {
        return 0;
    }

    @Override
    public void crear() {
    }
    
}
