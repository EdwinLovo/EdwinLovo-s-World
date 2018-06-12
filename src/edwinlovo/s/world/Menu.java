/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edwinlovo.s.world;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import EdificacionesMilitar.FabricaConvoy;
import EdificacionesMilitar.FabricaEscuadron;
import EdificacionesMilitar.FabricaRambo;
import EdificacionesMilitar.FabricaVehiculo;
import Militar.Militar;
import Militar.Convoy;
import EdificacionesMilitar.GeneradorDiamante;
import EdificacionesMilitar.RecolectorEfectivo;
import EdificacionesMilitar.RecolectorOro;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import java.util.Scanner;

/**
 *
 * @author EdwinLovo
 */
public class Menu {
    int est1=0,est2=0,est3=0;
    AbstractFactory factory1 = FactoryProducer.getFactory("militar");
    public static Menu menu = Menu.getInstance();
    SingletonMilitar militar = SingletonMilitar.getInstance();
    Fase fase = Fase.getInstance();
    RecolectorEfectivo efectivo = new RecolectorEfectivo(fase.getFase());
    RecolectorOro oro = new RecolectorOro(fase.getFase());
    GeneradorDiamante diamante = new GeneradorDiamante(fase.getFase());
    
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
        System.out.println("6. Mejorar Centro de Mando");
        System.out.println("7. Terminar turno");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menu.contruirFabMili();
                System.out.println("construir");
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                menu.recogerRecMili();
                System.out.println("recoger");
                break;
            case 5:
                menu.entrenarMili();
                System.out.println("entrenar");
                break;
            case 6:
                menu.mejorarCM();
                System.out.println("Mejora nivel hecha");
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
        
        GeneradorDiamante diamantes = new GeneradorDiamante(fase.getFase());
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
            System.out.println("Recurso 1: "+militar.getRecurso1()+" Recurso 2: "+militar.getRecurso2()+" Recurso 3: "+militar.getRecurso3());
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
            System.out.println("\n------FASE "+fase.getFase()+" TERMINADA------\n");
            
            militar.setRecurso3(diamantes.recolectar());
            fase.setFase(fase.getFase()+1);
            
        }while(ed1!=0 && ed2!=0);
    }
    
    public void contruirFabMili(){
        int opc;
        SingletonMilitar militares= SingletonMilitar.getInstance();
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
                if (militar.getRecurso1()>=700 && militar.getRecurso2()>=600 && militar.getRecurso3()>=500){
                    FabricaVehiculo fabVehi = new FabricaVehiculo(fase.getFase());
                    militar.setVehiculos(fabVehi);
                    militares.setRecurso1(-700);
                    militares.setRecurso2(-600);
                    militares.setRecurso3(-500);
                    System.out.println("fabve creado");
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                break;
            case 2:
                if (militar.getRecurso1()>=900 && militar.getRecurso2()>=900 && militar.getRecurso3()>=800){
                    FabricaConvoy fabCon = new FabricaConvoy(fase.getFase());
                    militar.setConvoys(fabCon);
                    System.out.println("fabco creado");
                    militares.setRecurso1(-900);
                    militares.setRecurso2(-900);
                    militares.setRecurso3(-800);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            case 3:
                if (militar.getRecurso1()>=1000 && militar.getRecurso2()>=800 && militar.getRecurso3()>=700){
                    FabricaEscuadron fabEsc = new FabricaEscuadron(fase.getFase());
                    militar.setEscuadrones(fabEsc);
                    System.out.println("fabes creado");
                    militares.setRecurso1(-1000);
                    militares.setRecurso2(-800);
                    militares.setRecurso3(-700);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            case 4:
                if (militar.getRecurso1()>=1700 && militar.getRecurso2()>=1400 && militar.getRecurso3()>=1200){
                    FabricaRambo ram = new FabricaRambo(fase.getFase());
                    militar.setRambos(ram);
                    System.out.println("fabRambo creado");
                    militares.setRecurso1(-1700);
                    militares.setRecurso2(-1400);
                    militares.setRecurso3(-1200);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
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
    
    public void recogerRecMili(){
        int r1, r2;
        r1 = efectivo.recolectar();
        r2 = oro.recolectar();
        militar.setRecurso1(r1);
        militar.setRecurso2(r2);
    }
    
    public void entrenarMili(){
        int opc;
        System.out.println("\n---MENU ENTRENAR TROPAS O TRANSPORTE DE MILITAR---\n");
        System.out.println("1. Entrenar Rambo");
        System.out.println("2. Entrenar Escuadron");
        System.out.println("3. Crear Convoy");
        System.out.println("4. Crear Vehiculo de ataque");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                Militar rambo = factory1.getMilitar("rambo");
                militar.getRambos()[0].setRambo(rambo);
                break;
            case 2:
                Militar escuadron = factory1.getMilitar("escuadron");
                militar.getEscuadrones().get(1).crear(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
                break;
            case 3:
                Militar convoy = factory1.getMilitar("convoy");
                militar.getConvoys().get(1).crear(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
                break;
            case 4:
                Militar vehiculo = factory1.getMilitar("vehiculo");
                militar.getVehiculos().get(1).crear(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
                break;
            default:
                break;
        }
    }
    
    public void mejorarCM(){
        if(est1==0){
          militar.mejora1(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
        }
        else if(est1==1){
            militar.mejora2(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
        }
        else if(est1==2){
            militar.mejora3(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
        }
        est1=est1+1;
    }
}
