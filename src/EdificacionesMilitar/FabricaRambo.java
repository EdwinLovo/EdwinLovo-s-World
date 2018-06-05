/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesMilitar;

import Militar.Militar;
import Singletons.Fase;

/**
 *
 * @author EdwinLovo
 */
public class FabricaRambo implements Militar{

    @Override
    public void atacar() {
    }

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void crear() {
        System.out.println("Crear");
    }
    
}
