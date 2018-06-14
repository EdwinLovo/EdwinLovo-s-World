/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesMilitar;

import Militar.Militar;
import Militar.Rambo;
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
    private Militar[] rambo = new Militar[1];

    public FabricaRambo(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Militar[] getRambo() {
        return rambo;
    }

    public void setRambo(Militar rambo) {
        this.rambo[0] = rambo;
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

    public void crear(int r1, int r2, int r3) {
        System.out.println("Crear");
        if(r1>=200 && r2>=200 && cr<1){
            Rambo ram = new Rambo();
            rambo[0]=ram;
            cr+=1;
            militares.setRecurso1(-200);
            militares.setRecurso2(-200);
            militares.setRecurso3(-200);
            System.out.println("Rambo creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
