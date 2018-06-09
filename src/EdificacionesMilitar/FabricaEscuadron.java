/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesMilitar;

import Militar.Militar;
import PoderMilitar.Escuadron;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaEscuadron implements Militar{
    int faseAlmacenada, vida =500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonMilitar militares = SingletonMilitar.getInstance();
    private Map<Integer,Escuadron> escuadrones = new HashMap<Integer,Escuadron>();

    public FabricaEscuadron(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Escuadron> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(Map<Integer, Escuadron> escuadrones) {
        this.escuadrones = escuadrones;
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
    
    @Override
    public void atacar() {
    }

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void crear(int r1, int r2, int r3) {
        System.out.println("Crear");
        if(r1>=200 && r2>=200){
            Escuadron esc = new Escuadron();
            escuadrones.put(ind, esc);
            ind+=1;
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
