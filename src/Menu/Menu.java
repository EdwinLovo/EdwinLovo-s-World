/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author EdwinLovo
 */
public class Menu {
    
    public static Menu menu;

    public Menu() {
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void menuRaza(){
        int opc=0;
        System.out.println("----------RAZAS----------");
        System.out.println("1. Militar");
        System.out.println("2. Revolucionario");
        System.out.println("3. Terrorista");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Crear militar");
                break;
            case 2:
                System.out.println("Crear revolucionario");
                break;
            case 3:
                System.out.println("Crear terrorista");
                break;
            default:
                System.out.println("Se elegio militar por defecto");
        }
    }
    
    public void menuJugar(){
        int ed1=1, ed2=1,opc=0;
        
        do{
            System.out.println("------TURNO JUGADOR 1------");
            System.out.println("1. Construir edificio ");
            System.out.println("2. Atacar");
            System.out.println("3. Defender");
            System.out.println("4. Recoger recursos");
            System.out.println("5. Entrenar tropas");
            System.out.println("6. Crear vehiculos");
            
            Scanner leer = new Scanner(System.in);
            System.out.print("\nIngrese su opcion: ");
            opc = leer.nextInt();
            
            switch(opc){    
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
            
            System.out.println("------TURNO JUGADOR 2------");
            System.out.println("1. Construir edificio ");
            System.out.println("2. Atacar");
            System.out.println("3. Defender");
            System.out.println("4. Recoger recursos");
            System.out.println("5. Entrenar tropas");
            System.out.println("6. Crear vehiculos");
            
            System.out.print("\nIngrese su opcion: ");
            opc = leer.nextInt();
            
            switch(opc){    
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
            
            System.out.println("\n------FASE TERMINADA------\n");
        }while(ed1!=0 && ed2!=0);
    }
}
