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
    int vida=500,pAta=100;
    Menu menu = Menu.getInstance();
    SingletonMilitar militar = SingletonMilitar.getInstance();
    /*
    public int getpAta() {
        return pAta;
    }

    public void setpAta(int pAta) {
        this.pAta = pAta;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }*/
    
    @Override
    public void atacar() {
        int opc1,opc2,key=0,life;
        
        System.out.println("Elija el tipo de fabrica a atacar: \n");
        System.out.println("1.Fabrica de Vehiculo");
        System.out.println("1.Fabrica de Convoy");
        System.out.println("1.Fabrica de Escuadron");
        System.out.println("1.Fabrica de Rambo");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc1 = leer.nextInt();
        
        switch (opc1) {
            case 1:
                menu.mostrarFabsVehi();
                System.out.print("\nIngrese la clave de la Fabrica de Vehiculo a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getVehiculos().get(key).getVida();
                militar.getVehiculos().get(key).setVida(life-100);
                if(militar.getVehiculos().get(key).getVida()==0){
                    militar.getVehiculos().remove(key);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        
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
