/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransporteRevolucionario;

import Revolucionario.Revolucionario;

/**
 *
 * @author EdwinLovo
 */
public class MotoGarage implements Revolucionario{

    @Override
    public void atacar() {
        System.out.println("atacar");
    }

    @Override
    public void defender() {
        System.out.println("Defender");
    }

    @Override
    public void recolectar() {
    }

    @Override
    public void crear() {
    }
    
}
