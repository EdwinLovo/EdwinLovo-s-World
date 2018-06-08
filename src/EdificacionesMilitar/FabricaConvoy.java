/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesMilitar;

import Militar.Militar;
import Singletons.Fase;
import Singletons.SingletonMilitar;

/**
 *
 * @author EdwinLovo
 */
public class FabricaConvoy implements Militar{
    int faseAlmacenada;
    Fase fase = Fase.getInstance();
    SingletonMilitar convoys = SingletonMilitar.getInstance();

    public FabricaConvoy(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
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
            FabricaConvoy conv = new FabricaConvoy(fase.getFase());
            convoys.setConvoys(conv);
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
