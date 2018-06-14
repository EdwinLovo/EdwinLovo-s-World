/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRevolucionario;

import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;

/**
 *
 * @author EdwinLovo
 */
public class GeneradorBitCoins{
    int faseAlmacenada,vida=500;
    SingletonRevolucionario revolucionarios= SingletonRevolucionario.getInstance();
    Fase fase = Fase.getInstance();
    
    public GeneradorBitCoins(int faseAlmacenada) {
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
        
        cant = 500*(fase.getFase()-faseAlmacenada);
        faseAlmacenada= fase.getFase();
        return cant;
    }

}
