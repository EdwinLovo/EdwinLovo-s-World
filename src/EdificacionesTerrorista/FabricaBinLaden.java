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

/**
 *
 * @author Edwinlovo
 */
public class FabricaBinLaden {

    int faseAlmacenada, vida=500,cr=0;
    Fase fase = Fase.getInstance();
    SingletonTerrorista terroristas = SingletonTerrorista.getInstance();
    private Terrorista[] bin = new Terrorista[1];

    public FabricaBinLaden(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Terrorista[] getBin() {
        return bin;
    }

    public void setRambo(Terrorista bin) {
        this.bin[0] = bin;
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
            BinLaden ram = new BinLaden();
            bin[0]=ram;
            cr+=1;
            terroristas.setRecurso1(-200);
            terroristas.setRecurso2(-200);
            terroristas.setRecurso3(-200);
            System.out.println("Rambo creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
