
package EdificacionesTerrorista;

import Singletons.Fase;
import Singletons.SingletonTerrorista;
import Terrorista.Bus;
import Terrorista.Terrorista;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaBus {

    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonTerrorista terroristas = SingletonTerrorista.getInstance();
    private Map<Integer,Bus> buses = new HashMap<Integer,Bus>();

    public FabricaBus(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Bus> getBuses() {
        return buses;
    }

    public void setBuses(Map<Integer, Bus> buses) {
        this.buses = buses;
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
            Bus conv = new Bus();
            buses.put(ind, conv);
            ind+=1;
            terroristas.setRecurso1(-200);
            terroristas.setRecurso2(-200);
            System.out.println("Bus creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
   
}
