/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import EdificacionesMilitar.FabricaVehiculo;
import Militar.Militar;
import Singletons.SingletonMilitar;
import java.util.Scanner;

/**
 *
 * @author EdwinLovo
 */
public class Menu {
    AbstractFactory factory1 = FactoryProducer.getFactory("militar");
    public static Menu menu = Menu.getInstance();

    public Menu() {
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
    
    public int menuRaza(){
        System.out.println("fin1");
        int opc;
        System.out.println("\n\n----------RAZAS----------");
        System.out.println("1. Militar");
        System.out.println("2. Revolucionario");
        System.out.println("3. Terrorista");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        System.out.println(opc);
        switch(opc){
            case 1:
                System.out.println("Crear militar");
                System.out.println("fin2");
                System.out.println(opc);
                return opc;
            case 2:
                System.out.println("Crear revolucionario");
                return opc;
            case 3:
                System.out.println("Crear terrorista");
                return opc;
            default:
                System.out.println("Se elegio militar por defecto");
                return 1;
        }
    }
    
    public void menuMilitar(){
        int ed1=1, ed2=1,opc=0;
        int oro,diamante,efectivo;
        System.out.println("1. Construir edificio ");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Recoger recursos");
        System.out.println("5. Entrenar tropas");
        System.out.println("6. Crear vehiculos");
        System.out.println("7. Terminar turno");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("construir");
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                System.out.println("recoger");
                break;
            case 5:
                System.out.println("entrenar");
                break;
            case 6:
                System.out.println("crear");
                break;
            default:
                System.out.println("");
        }
    }
    
    public void menuRevolucionario(){
        int ed1 = 1, ed2 = 1, opc = 0;
        int oro, diamante, efectivo;
        System.out.println("1. Construir edificio ");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Recoger recursos");
        System.out.println("5. Entrenar tropas");
        System.out.println("6. Crear vehiculos");
        System.out.println("7. Terminar turno");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("construir");
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                System.out.println("recoger");
                break;
            case 5:
                System.out.println("entrenar");
                break;
            case 6:
                System.out.println("crear");
                break;
            default:
                System.out.println("");
        }
    }
    
    public void menuTerrorista(){
        int ed1=1, ed2=1,opc=0;
        int oro,diamante,efectivo;
        System.out.println("1. Construir edificio ");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Recoger recursos");
        System.out.println("5. Entrenar tropas");
        System.out.println("6. Crear vehiculos");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("construir");
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                System.out.println("recoger");
                break;
            case 5:
                System.out.println("entrenar");
                break;
            case 6:
                System.out.println("crear");
                break;
            default:
                System.out.println("");
        }
    }
    
    public void menuJugar(){
        int ed1=1, ed2=1,opc=0;
        int oro,diamante,efectivo;
        //CentroMando cm1,cm2;
        int j1, j2=0;
        j1=menu.menuRaza();
        if(j1==1){
            SingletonMilitar militar= SingletonMilitar.getInstance();
        }
        //cm1 = new CentroMando(2,3,4,5,6,7,8);
        //System.out.println("Jugador 1: "+j1);
        j2= menu.menuRaza();
        if(j1==2){
            SingletonMilitar militar= SingletonMilitar.getInstance();
        }
        //cm2 = new CentroMando(1,2,3,4,5,6,7);
        //System.out.println("Jugador 2: "+j2);
        //System.out.println("FIN");
        do{
            System.out.println("\n\n------TURNO JUGADOR 1------");
            switch (j1) {
                case 1:
                    menu.menuMilitar();
                    break;
                case 2:
                    menu.menuRevolucionario();
                    break;
                case 3:
                    menu.menuTerrorista();
                    break;
                default:
                    break;
            }
            System.out.println("\n\n------TURNO JUGADOR 2------");
            switch (j2) {
                case 1:
                    menu.menuMilitar();
                    break;
                case 2:
                    menu.menuRevolucionario();
                    break;
                case 3:
                    menu.menuTerrorista();
                    break;
                default:
                    break;
            }
            
            System.out.println("\n------FASE TERMINADA------\n");
        }while(ed1!=0 && ed2!=0);
    }
    
    public void contruirFabMili(){
        int opc;
        System.out.println("\n---MENU CONTRUIR FABRICAS DE MILITAR---\n");
        System.out.println("1. Fabrica Vehiculos");
        System.out.println("2. Fabrica Convoy");
        System.out.println("3. Fabrica Escuadrones");
        System.out.println("4. Fabrica Rambo");
        System.out.println("5. Recolector Efectivo");
        System.out.println("6. Recolector Oro");
        System.out.println("7. Generador Diamantes");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                Militar vehiculo = factory1.getMilitar("vehiculo");
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
            
    }
}
