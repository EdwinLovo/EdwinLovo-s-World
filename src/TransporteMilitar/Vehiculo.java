/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransporteMilitar;

import Militar.Militar;

/**
 *
 * @author EdwinLovo
 */
public class Vehiculo implements Militar{

    @Override
    public void atacar() {
        System.out.println("Ataque militar");
    }

    @Override
    public void defender() {
        System.out.println("Defiende militar");
    }

    @Override
    public void recolectar() {
    }

    @Override
    public void crear() {
    }
    
}
