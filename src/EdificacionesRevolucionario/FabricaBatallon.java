/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRevolucionario;

import Revolucionario.Batallon;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaBatallon{
    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonRevolucionario revolucionarios = SingletonRevolucionario.getInstance();
    private Map<Integer,Batallon> batallones = new HashMap<Integer,Batallon>();

    public FabricaBatallon(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Batallon> getBatallones() {
        return batallones;
    }

    public void setBatallones(Map<Integer, Batallon> batallones) {
        this.batallones = batallones;
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
*/
   
    public void crear(int r1, int r2, int r3) {
        System.out.println("Crear");
        if(r1>=200 && r2>=200){
            Batallon conv = new Batallon();
            batallones.put(ind, conv);
            ind+=1;
            revolucionarios.setRecurso1(-200);
            revolucionarios.setRecurso2(-200);
            System.out.println("Batallon creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
}
