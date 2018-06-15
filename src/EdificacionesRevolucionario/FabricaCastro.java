
package EdificacionesRevolucionario;

import Militar.Rambo;
import Revolucionario.Castro;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaCastro{
    int faseAlmacenada, vida=500,cr=0;
    Fase fase = Fase.getInstance();
    SingletonRevolucionario revolucionarios = SingletonRevolucionario.getInstance();
    private Map<Integer,Castro> castro = new HashMap<Integer,Castro>();
    
    public FabricaCastro(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Castro> getCastro() {
        return castro;
    }

    public void setCastro(Map<Integer, Castro> castro) {
        this.castro = castro;
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
            Castro ram = new Castro();
            castro.put(1, ram);
            revolucionarios.setRecurso1(-200);
            revolucionarios.setRecurso2(-200);
            revolucionarios.setRecurso3(-200);
            System.out.println("Castro creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
}
