
package EdificacionesRevolucionario;

import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;

/**
 *
 * @author EdwinLovo
 */
public class RecolectorMetal{
    int faseAlmacenada,vida=500;
    SingletonRevolucionario revolucionarios= SingletonRevolucionario.getInstance();
    Fase fase = Fase.getInstance();

    public RecolectorMetal(int faseAlmacenada) {
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
