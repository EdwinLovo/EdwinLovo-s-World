/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursoMilitar;

import Militar.Militar;
import Singletons.Fase;

/**
 *
 * @author EdwinLovo
 */
public class RecolectorOro implements Militar{
    int faseAlmacenada;
    Fase fase = Fase.getInstance();

    public RecolectorOro(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public int getFaseAlmacenada() {
        return faseAlmacenada;
    }

    public void setFaseAlmacenada(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }
    
    @Override
    public void atacar() {
    }

    @Override
    public int recolectar() {
        int cant;

        cant = 250 * (fase.getFase() - faseAlmacenada);
        faseAlmacenada = fase.getFase();
        return cant;
    }

    @Override
    public void crear() {
    }
}
