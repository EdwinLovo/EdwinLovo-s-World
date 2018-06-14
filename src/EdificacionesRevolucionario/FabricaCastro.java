
package EdificacionesRevolucionario;

import Revolucionario.Castro;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonRevolucionario;

/**
 *
 * @author EdwinLovo
 */
public class FabricaCastro{
    int faseAlmacenada, vida=500,cr=0;
    Fase fase = Fase.getInstance();
    SingletonRevolucionario revolucionarios = SingletonRevolucionario.getInstance();
    private Revolucionario[] castro = new Revolucionario[1];

    public FabricaCastro(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Revolucionario[] getRevolucionario() {
        return castro;
    }

    public void setCastro(Revolucionario castro) {
        this.castro[0] = castro;
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
            castro[0]=ram;
            cr+=1;
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
