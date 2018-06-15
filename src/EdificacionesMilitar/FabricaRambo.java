
package EdificacionesMilitar;

import Militar.Militar;
import Militar.Rambo;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaRambo{
    int faseAlmacenada, vida=500,cr=0;
    Fase fase = Fase.getInstance();
    SingletonMilitar militares = SingletonMilitar.getInstance();
    private Map<Integer,Rambo> rambo = new HashMap<Integer,Rambo>();

    public FabricaRambo(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Rambo> getRambo() {
        return rambo;
    }

    public void setRambo(Map<Integer, Rambo> rambo) {
        this.rambo = rambo;
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
        if(r1>=200 && r2>=200 ){
            Rambo conv = new Rambo();
            rambo.put(1, conv);
            militares.setRecurso1(-200);
            militares.setRecurso2(-200);
            System.out.println("Rambo creado");
        }
        else{
            System.out.println("Recursos insuficientes ");
        }
    }
    
}
