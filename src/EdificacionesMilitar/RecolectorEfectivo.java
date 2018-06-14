
package EdificacionesMilitar;

import Militar.Militar;
import Singletons.Fase;
import Singletons.SingletonMilitar;

/**
 *
 * @author EdwinLovo
 */
public class RecolectorEfectivo{
    int faseAlmacenada,vida=500;
    SingletonMilitar militares= SingletonMilitar.getInstance();
    Fase fase = Fase.getInstance();

    public RecolectorEfectivo(int faseAlmacenada) {
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

        cant = 750 * (fase.getFase() - faseAlmacenada);
        faseAlmacenada = fase.getFase();
        return cant;
        
    }

}
