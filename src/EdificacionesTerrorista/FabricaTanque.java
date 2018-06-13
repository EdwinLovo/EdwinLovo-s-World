/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesTerrorista;

import Singletons.Fase;
import Singletons.SingletonTerrorista;
import Terrorista.Tanque;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaTanque {
    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonTerrorista terroristas = SingletonTerrorista.getInstance();
    private Map<Integer,Tanque> tanques = new HashMap<Integer,Tanque>();

    public FabricaTanque(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Tanque> getTanques() {
        return tanques;
    }

    public void setTanques(Map<Integer, Tanque> tanques) {
        this.tanques = tanques;
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
            Tanque conv = new Tanque();
            tanques.put(ind, conv);
            ind+=1;
            terroristas.setRecurso1(-200);
            terroristas.setRecurso2(-200);
            System.out.println("Tanque creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
}
