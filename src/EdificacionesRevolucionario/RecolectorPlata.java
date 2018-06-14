/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRevolucionario;

import Militar.Militar;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;


public class RecolectorPlata{
    int faseAlmacenada,vida=500;
    SingletonRevolucionario revolucionarios= SingletonRevolucionario.getInstance();
    Fase fase = Fase.getInstance();

    public RecolectorPlata(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public int getFaseAlmacenada() {
        return faseAlmacenada;
    }

    public void setFaseAlmacenada(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public int recolectar() {
        int cant;

        cant = 750 * (fase.getFase() - faseAlmacenada);
        faseAlmacenada = fase.getFase();
        return cant;
        
    }
    
}
