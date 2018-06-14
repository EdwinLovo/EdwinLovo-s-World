
package EdificacionesRevolucionario;

import Revolucionario.Moto;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaMoto{
    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonRevolucionario revolucionarios = SingletonRevolucionario.getInstance();
    private Map<Integer,Moto> motos = new HashMap<Integer,Moto>();

    public FabricaMoto(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Moto> getMotos() {
        return motos;
    }

    public void setMotos(Map<Integer, Moto> motos) {
        this.motos = motos;
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
        if(r1>=200 && r2>=200){
            Moto conv = new Moto();
            motos.put(ind, conv);
            ind+=1;
            revolucionarios.setRecurso1(-200);
            revolucionarios.setRecurso2(-200);
            System.out.println("Helicoptero creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
