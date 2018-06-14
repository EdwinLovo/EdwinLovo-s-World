
package EdificacionesMilitar;

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

    public int recolectar() {
        int cant;
        
        cant = 500*(fase.getFase()-faseAlmacenada);
        faseAlmacenada= fase.getFase();
        return cant;
    }

}
