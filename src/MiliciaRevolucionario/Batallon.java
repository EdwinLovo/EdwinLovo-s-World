/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaRevolucionario;

import Revolucionario.Revolucionario;

/**
 *
 * @author EdwinLovo
 */
public class Batallon implements Revolucionario{

    @Override
    public void atacar() {
        System.out.println("Atacar");
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
