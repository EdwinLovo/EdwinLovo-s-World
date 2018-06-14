/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    SingletonMilitar militar = SingletonMilitar.getInstance();
    
    @Override
    public void atacar(int j) {
        switch (j) {
            case 1:
                menu.atacarFabMilitar();
                break;
            case 2:
                menu.atacarFabRevolucionario();
                break;
            case 3:
                menu.atacarFabTerrorista();
                break;
            default:
                break;
        }
        System.out.println(""); 
        
        System.out.println("Atacar");
    }

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void crear(int r1, int r2, int r3) {
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public int getVida() {
        return vida;
    }

}
