/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursoMilitar;

import Militar.Militar;

/**
 *
 * @author EdwinLovo
 */
public class Oro implements Militar{

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public int recolectar(int cant,int fase) {
        System.out.println("Recolectado militar");
        return cant;
    }

    @Override
    public void crear() {
    }
    
}
