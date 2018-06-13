/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesTerrorista;

import Singletons.Fase;
import Singletons.SingletonTerrorista;
import Terrorista.Secta;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaSecta {
    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonTerrorista terroristas = SingletonTerrorista.getInstance();
    private Map<Integer,Secta> sectas = new HashMap<Integer,Secta>();

    public FabricaSecta(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Secta> getSectas() {
        return sectas;
    }

    public void setSectas(Map<Integer, Secta> sectas) {
        this.sectas = sectas;
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
            Secta conv = new Secta();
            sectas.put(ind, conv);
            ind+=1;
            terroristas.setRecurso1(-200);
            terroristas.setRecurso2(-200);
            System.out.println("Secta creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
}
