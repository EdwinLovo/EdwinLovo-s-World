/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesTerrorista;

import Singletons.Fase;
import Singletons.SingletonTerrorista;
import Terrorista.Terrorista;

/**
 *
 * @author EdwinLovo
 */
public class GeneradorMonedas {

    int faseAlmacenada,vida=500;
    SingletonTerrorista terroristas= SingletonTerrorista.getInstance();
    Fase fase = Fase.getInstance();
    
    public GeneradorMonedas(int faseAlmacenada) {
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
    /*
    @Override
    public void atacar() {
    }

    @Override*/
    public int recolectar() {
        int cant;
        
        cant = 500*(fase.getFase()-faseAlmacenada);
        faseAlmacenada= fase.getFase();
        return cant;
    }
    
}
