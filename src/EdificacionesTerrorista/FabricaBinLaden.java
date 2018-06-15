/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesTerrorista;

import Singletons.Fase;
import Singletons.SingletonTerrorista;
import Terrorista.BinLaden;
import Terrorista.Terrorista;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Edwinlovo
 */
public class FabricaBinLaden {

    int faseAlmacenada, vida=500,cr=0;
    Fase fase = Fase.getInstance();
    SingletonTerrorista terroristas = SingletonTerrorista.getInstance();
    private Map<Integer,BinLaden> bin = new HashMap<Integer,BinLaden>();

    public FabricaBinLaden(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer,BinLaden> getBin() {
        return bin;
    }

    public void setRambo(Map<Integer,BinLaden> bin) {
        this.bin = bin;
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
            BinLaden ram = new BinLaden();
            bin.put(1, ram);
            cr+=1;
            terroristas.setRecurso1(-200);
            terroristas.setRecurso2(-200);
            terroristas.setRecurso3(-200);
            System.out.println("BinLaden creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
