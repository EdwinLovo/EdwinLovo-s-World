
package Militar;

import Militar.Militar;
import Singletons.Fase;
import edwinlovo.s.world.Menu;

/**
 *
 * @author EdwinLovo
 */
public class Vehiculo implements Militar{
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
        System.out.println("Atacar");
    }
    
    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void defender(int j) {
        switch (j) {
            case 1:
                menu.atacarTropasMili(pAta);
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
    public int getAtaque() {
        return pAta;
    }
}
