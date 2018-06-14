/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRevolucionario;

import Revolucionario.Helicoptero;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaHelicoptero{
    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonRevolucionario revolucionarios = SingletonRevolucionario.getInstance();
    private Map<Integer,Helicoptero> helicopteros = new HashMap<Integer,Helicoptero>();

    public FabricaHelicoptero(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Helicoptero> getHelicopteros() {
        return helicopteros;
    }

    public void setHelicopteros(Map<Integer, Helicoptero> helicopteros) {
        this.helicopteros = helicopteros;
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
        if(r1>=200 && r2>=200){
            Helicoptero conv = new Helicoptero();
            helicopteros.put(ind, conv);
            ind+=1;
            revolucionarios.setRecurso1(-200);
            revolucionarios.setRecurso2(-200);
            System.out.println("Helicoptero creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
}
