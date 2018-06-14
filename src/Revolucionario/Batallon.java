
package Revolucionario;

import Revolucionario.Revolucionario;
import edwinlovo.s.world.Menu;

/**
 *
 * @author EdwinLovo
 */
public class Batallon implements Revolucionario{
    int vida=500,pAta=100;
    Menu menu = Menu.getInstance();
    @Override
    public void atacar(int j) {
        switch (j) {
            case 1:
                menu.atacarFabMilitar(pAta);
                break;
            case 2:
                menu.atacarFabRevolucionario(pAta);
                break;
            case 3:
                menu.atacarFabTerrorista(pAta);
                break;
            default:
                break;
        }
    }

    @Override
    public void generar() {
    }

    @Override
    public void recolectar() {
    }

    @Override
    public void crear() {
    }
}
