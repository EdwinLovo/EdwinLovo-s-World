/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursoMilitar;

import Militar.Militar;
import Singletons.Fase;
import Singletons.SingletonMilitar;

/**
 *
 * @author EdwinLovo
 */
public class GeneradorDiamante{
    int faseAlmacenada,vida=500;
    SingletonMilitar militares= SingletonMilitar.getInstance();
    Fase fase = Fase.getInstance();
    
    public GeneradorDiamante(int faseAlmacenada) {
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
/*
    @Override*/
    public void crear(int r1, int r2, int r3) {
        if (r1>=200 && r2>=200){
            GeneradorDiamante fabDiamante = new GeneradorDiamante(fase.getFase());
            militares.setDiamantes(fabDiamante);
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }

}
