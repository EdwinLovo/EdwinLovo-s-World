/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesMilitar;

import Militar.Militar;
import PoderMilitar.Rambo;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaRambo{
    int faseAlmacenada, vida=500,cr=0;
    Fase fase = Fase.getInstance();
    SingletonMilitar militares = SingletonMilitar.getInstance();
    private Rambo[] rambo = new Rambo[1];

    public FabricaRambo(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Rambo[] getRambo() {
        return rambo;
    }

    public void setRambo(Rambo[] rambo) {
        this.rambo = rambo;
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

    @Override
    public int recolectar() {
        return 0;
    }

    @Override*/
    public void crear(int r1, int r2, int r3) {
        System.out.println("Crear");
        if(r1>=200 && r2>=200 && cr<1){
            Rambo ram = new Rambo();
            rambo[0]=ram;
            cr+=1;
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
