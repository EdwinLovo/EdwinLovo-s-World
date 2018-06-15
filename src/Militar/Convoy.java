
package Militar;

import Militar.Militar;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import edwinlovo.s.world.Menu;
import java.util.Scanner;

/**
 *
 * @author EdwinLovo
 */
public class Convoy implements Militar{
    int vida=500,pAta=100,opc;
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
        System.out.println(""); 
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
