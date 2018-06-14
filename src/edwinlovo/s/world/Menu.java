
package edwinlovo.s.world;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import EdificacionesMilitar.FabricaConvoy;
import EdificacionesMilitar.FabricaEscuadron;
import EdificacionesMilitar.FabricaRambo;
import EdificacionesMilitar.FabricaVehiculo;
import Militar.Militar;
import EdificacionesMilitar.GeneradorDiamante;
import EdificacionesMilitar.RecolectorEfectivo;
import EdificacionesMilitar.RecolectorOro;
import EdificacionesRevolucionario.FabricaBatallon;
import EdificacionesRevolucionario.FabricaCastro;
import EdificacionesRevolucionario.FabricaHelicoptero;
import EdificacionesRevolucionario.FabricaMoto;
import EdificacionesRevolucionario.GeneradorBitCoins;
import EdificacionesRevolucionario.RecolectorMetal;
import EdificacionesRevolucionario.RecolectorPlata;
import EdificacionesTerrorista.FabricaBinLaden;
import EdificacionesTerrorista.FabricaBus;
import EdificacionesTerrorista.FabricaSecta;
import EdificacionesTerrorista.FabricaTanque;
import EdificacionesTerrorista.GeneradorMonedas;
import EdificacionesTerrorista.RecolectorPetroleo;
import EdificacionesTerrorista.RecolectorQuimicos;
import Revolucionario.Revolucionario;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import Singletons.SingletonRevolucionario;
import Singletons.SingletonTerrorista;
import Terrorista.Terrorista;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
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
    SingletonRevolucionario revolucionario = SingletonRevolucionario.getInstance();
    SingletonTerrorista terrorista = SingletonTerrorista.getInstance();
    Fase fase = Fase.getInstance();
    /*RecolectorEfectivo efectivo = new RecolectorEfectivo(fase.getFase());
    RecolectorOro oro = new RecolectorOro(fase.getFase());*/
    GeneradorDiamante diamante;
    int j1, j2=0;
    RecolectorEfectivo recEfectivo[] = new RecolectorEfectivo[1];
    RecolectorOro recOro[] = new RecolectorOro[1];
    GeneradorDiamante genDiamante[] = new GeneradorDiamante[1];
    RecolectorMetal recMetal[] = new RecolectorMetal[1];
    RecolectorPlata recPlata[] = new RecolectorPlata[1];
    GeneradorBitCoins genBitCoins[] = new GeneradorBitCoins[1];
    RecolectorQuimicos recQuimicos[] = new RecolectorQuimicos[1];
    RecolectorPetroleo recPetroleo[] = new RecolectorPetroleo[1];
    GeneradorMonedas genMonedas[] = new GeneradorMonedas[1];
    
    public Menu() {
    }
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
    
    public int menuRaza(){
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
        System.out.println("\nEfectivo Máximo: "+militar.getLimite1()+" Oro Máximo: "+militar.getLimite2()+" Diamantes Máximos: "+militar.getLimite3());
        System.out.println("\nEfectivo: "+militar.getRecurso1()+" Oro: "+militar.getRecurso2()+" Diamantes: "+militar.getRecurso3());
        System.out.println("\n1. Construir edificio ");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Recoger recursos");
        System.out.println("5. Entrenar tropas");
        System.out.println("6. Mejorar Centro de Mando");
        System.out.println("7. Construir recolector de Oro");
        System.out.println("8. Construir recolector de Efectivo");
        System.out.println("9. Construir generador de Diamante");
        System.out.println("10. Terminar turno");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menu.contruirFabMili();
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                menu.recogerRecMili();
                break;
            case 5:
                menu.entrenarMili();
                break;
            case 6:
                menu.mejorarCM();
                break;
            case 7:
                if(recOro[0]==null){
                    recOro[0]= new RecolectorOro(fase.getFase());
                }
                else{
                    System.out.println("Recolector ya existente");
                }
                break;
            case 8:
                if(recEfectivo[0]==null){
                    recEfectivo[0]= new RecolectorEfectivo(fase.getFase());
                }
                else{
                    System.out.println("Recolector ya existente");
                }
                break;
            case 9:
                if(this.diamante==null){
                    this.diamante= new GeneradorDiamante(fase.getFase());
                }
                else{
                    System.out.println("Generador ya existente");
                }
                break;
            default:
                System.out.println("");
        }
    }
    
    public void menuRevolucionario(){
        int ed1 = 1, ed2 = 1, opc = 0;
        int oro, diamante, efectivo;
        System.out.println("\nMetal Máximo: "+revolucionario.getLimite1()+" Plata Máximo: "+revolucionario.getLimite2()+" BitCoins Máximos: "+revolucionario.getLimite3());
        System.out.println("\nMetal: "+revolucionario.getRecurso1()+" Plata: "+revolucionario.getRecurso2()+" BitCoins: "+revolucionario.getRecurso3());
        System.out.println("1. Construir edificio ");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Recoger recursos");
        System.out.println("5. Entrenar tropas");
        System.out.println("6. Mejorar Centro de Mando");
        System.out.println("7. Construir recolector de Metal");
        System.out.println("8. Construir recolector de Plata");
        System.out.println("9. Construir generador de BitCoins");
        System.out.println("10. Terminar turno");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menu.construirFabRev();
                System.out.println("construir");
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                menu.recogerRecRev();
                System.out.println("recoger");
                break;
            case 5:
                menu.entrenarRevo();
                System.out.println("entrenar");
                break;
            case 6:
                menu.mejorarCMREV();
                System.out.println("mejorar");
                break;
            case 7:
                if(recMetal[0]==null){
                    recMetal[0]= new RecolectorMetal(fase.getFase());
                }
                else{
                    System.out.println("Recolector ya existente");
                }
                break;
            case 8:
                if(recPlata[0]==null){
                    recPlata[0]= new RecolectorPlata(fase.getFase());
                }
                else{
                    System.out.println("Recolector ya existente");
                }
                break;
            case 9:
                if(genBitCoins[0]==null){
                    genBitCoins[0]= new GeneradorBitCoins(fase.getFase());
                }
                else{
                    System.out.println("Generador ya existente");
                }
            default:
                System.out.println("");
        }
    }
    
    public void menuTerrorista(){
        int ed1 = 1, ed2 = 1, opc = 0;
        int oro, diamante, efectivo;
        System.out.println("\nPetroleo Máximo: "+terrorista.getLimite1()+" Quimicos Máximo: "+terrorista.getLimite2()+" Monedas Máximos: "+terrorista.getLimite3());
        System.out.println("\nPetroleo: "+terrorista.getRecurso1()+" Quimicos: "+terrorista.getRecurso2()+" Monedas: "+terrorista.getRecurso3());
        System.out.println("1. Construir edificio ");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Recoger recursos");
        System.out.println("5. Entrenar tropas");
        System.out.println("6. Mejorar Centro de Mando");
        System.out.println("7. Construir recolector de Petroleo");
        System.out.println("8. Construir recolector de Quimicos");
        System.out.println("9. Construir generador de Monedas");
        System.out.println("10. Terminar turno");

        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                menu.construirFabTerro();
                System.out.println("construir");
                break;
            case 2:
                System.out.println("atacar");
                break;
            case 3:
                System.out.println("defender");
                break;
            case 4:
                menu.recogerRecTerro();
                System.out.println("recoger");
                break;
            case 5:
                menu.entrenarTerro();
                System.out.println("entrenar");
                break;
            case 6:
                menu.mejorarCMTERR();
                System.out.println("mejorar");
                break;
            case 7:
                if(recPetroleo[0]==null){
                    recPetroleo[0]= new RecolectorPetroleo(fase.getFase());
                }
                else{
                    System.out.println("Recolector ya existente");
                }
                break;
            case 8:
                if(recQuimicos[0]==null){
                    recQuimicos[0]= new RecolectorQuimicos(fase.getFase());
                }
                else{
                    System.out.println("Recolector ya existente");
                }
                break;
            case 9:
                if(genMonedas[0]==null){
                    genMonedas[0]= new GeneradorMonedas(fase.getFase());
                }
                else{
                    System.out.println("Generador ya existente");
                }
            default:
                System.out.println("");
        }
    }
    
    public void menuJugar(){
        
        GeneradorDiamante diamantes = new GeneradorDiamante(fase.getFase());
        int ed1=1, ed2=1,opc=0;
        int oro,diamante,efectivo;
        //CentroMando cm1,cm2;
        
        j1=menu.menuRaza();
        j2= menu.menuRaza();
        
        
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
            System.out.println("\n------FASE "+fase.getFase()+" TERMINADA------\n");
            System.out.println("diam: "+genDiamante[0]);
            if(this.diamante!=null){
                militar.setRecurso3(this.diamante.recolectar());
            }
            if(genBitCoins[0]!=null){
                revolucionario.setRecurso3(genBitCoins[0].recolectar());
            }
            if(genMonedas[0]!=null){
                terrorista.setRecurso3(genMonedas[0].recolectar());
            }
            fase.setFase(fase.getFase()+1);
            menu.mostrarFabsVehi();
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
                if (militar.getRecurso1()>=1000 && militar.getRecurso2()>=800 && militar.getRecurso3()>=500){
                    FabricaEscuadron fabEsc = new FabricaEscuadron(fase.getFase());
                    militar.setEscuadrones(fabEsc);
                    System.out.println("fabes creado");
                    militares.setRecurso1(-1000);
                    militares.setRecurso2(-800);
                    militares.setRecurso3(-500);
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
            default:
                break;
        }
    }
    
    public void construirFabRev(){
        int opc;
        SingletonRevolucionario revolucionario= SingletonRevolucionario.getInstance();
        System.out.println("\n---MENU CONTRUIR FABRICAS DE REVOLUCIONARIO---\n");
        System.out.println("1. Fabrica Batallon");
        System.out.println("2. Fabrica Helicoptero");
        System.out.println("3. Fabrica Moto");
        System.out.println("4. Fabrica Fidel Castro");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                if (revolucionario.getRecurso1()>=700 && revolucionario.getRecurso2()>=600 && revolucionario.getRecurso3()>=500){
                    FabricaBatallon fabBat = new FabricaBatallon(fase.getFase());
                    revolucionario.setBatallones(fabBat);
                    revolucionario.setRecurso1(-700);
                    revolucionario.setRecurso2(-600);
                    revolucionario.setRecurso3(-500);
                    System.out.println("fabba creado");
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                break;
            case 2:
                if (revolucionario.getRecurso1()>=900 && revolucionario.getRecurso2()>=900 && revolucionario.getRecurso3()>=800){
                    FabricaHelicoptero fabHel = new FabricaHelicoptero(fase.getFase());
                    revolucionario.setHelicopteros(fabHel);
                    System.out.println("fabhecreado");
                    revolucionario.setRecurso1(-900);
                    revolucionario.setRecurso2(-900);
                    revolucionario.setRecurso3(-800);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            case 3:
                if (revolucionario.getRecurso1()>=1000 && revolucionario.getRecurso2()>=800 && revolucionario.getRecurso3()>=700){
                    FabricaMoto fabMot = new FabricaMoto(fase.getFase());
                    revolucionario.setMotos(fabMot);
                    System.out.println("fabmot creado");
                    revolucionario.setRecurso1(-1000);
                    revolucionario.setRecurso2(-800);
                    revolucionario.setRecurso3(-700);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            case 4:
                if (revolucionario.getRecurso1()>=1700 && revolucionario.getRecurso2()>=1400 && revolucionario.getRecurso3()>=1200){
                    FabricaCastro cas = new FabricaCastro(fase.getFase());
                    revolucionario.setCastros(cas);
                    System.out.println("fabcas creado");
                    revolucionario.setRecurso1(-1700);
                    revolucionario.setRecurso2(-1400);
                    revolucionario.setRecurso3(-1200);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            default:
                break;
        }
    }
    
    public void construirFabTerro(){
        int opc;
        SingletonTerrorista terrorista= SingletonTerrorista.getInstance();
        System.out.println("\n---MENU CONTRUIR FABRICAS DE TERRORISTA---\n");
        System.out.println("1. Fabrica Bus");
        System.out.println("2. Fabrica Secta");
        System.out.println("3. Fabrica Tanque");
        System.out.println("4. Fabrica BinLaden");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                if (terrorista.getRecurso1()>=700 && terrorista.getRecurso2()>=600 && terrorista.getRecurso3()>=500){
                    FabricaBus fabBus = new FabricaBus(fase.getFase());
                    terrorista.setBuses(fabBus);
                    terrorista.setRecurso1(-700);
                    terrorista.setRecurso2(-600);
                    terrorista.setRecurso3(-500);
                    System.out.println("fabbus creado");
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                break;
            case 2:
                if (terrorista.getRecurso1()>=900 && terrorista.getRecurso2()>=900 && terrorista.getRecurso3()>=800){
                    FabricaSecta fabSec = new FabricaSecta(fase.getFase());
                    terrorista.setSectas(fabSec);
                    System.out.println("fabse ecreado");
                    terrorista.setRecurso1(-900);
                    terrorista.setRecurso2(-900);
                    terrorista.setRecurso3(-800);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            case 3:
                if (terrorista.getRecurso1()>=1000 && terrorista.getRecurso2()>=800 && terrorista.getRecurso3()>=700){
                    FabricaTanque fabTan = new FabricaTanque(fase.getFase());
                    terrorista.setTanques(fabTan);
                    System.out.println("fabtan creado");
                    terrorista.setRecurso1(-1000);
                    terrorista.setRecurso2(-800);
                    terrorista.setRecurso3(-700);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            case 4:
                if (terrorista.getRecurso1()>=1700 && terrorista.getRecurso2()>=1400 && terrorista.getRecurso3()>=1200){
                    FabricaBinLaden bin = new FabricaBinLaden(fase.getFase());
                    terrorista.setBins(bin);
                    System.out.println("fabbin creado");
                    terrorista.setRecurso1(-1700);
                    terrorista.setRecurso2(-1400);
                    terrorista.setRecurso3(-1200);
                }
                else{
                    System.out.println("\nRecursos insuficientes");
                }
                
                break;
            default:
                break;
        }
    }
    
    public void recogerRecMili(){
        int r1, r2;
        r1 = recEfectivo[0].recolectar();
        r2 = recOro[0].recolectar();
        System.out.println("Efectivo recolectado: $"+r1);
        System.out.println("Oro recolectado: "+r2);
        militar.setRecurso1(r1);
        militar.setRecurso2(r2);
    }
    
    public void recogerRecRev(){
        int r1, r2;
        r1 = recMetal[0].recolectar();
        r2 = recPlata[0].recolectar();
        System.out.println("Metal recolectado: $"+r1);
        System.out.println("Plata recolectado: "+r2);
        revolucionario.setRecurso1(r1);
        revolucionario.setRecurso2(r2);
    }
    
    public void recogerRecTerro(){
        int r1, r2;
        r1 = recPetroleo[0].recolectar();
        r2 = recQuimicos[0].recolectar();
        System.out.println("Petroleo recolectado: $"+r1);
        System.out.println("Quimicos recolectado: "+r2);
        terrorista.setRecurso1(r1);
        terrorista.setRecurso2(r2);
    }
    
    public void entrenarMili(){
        int opc,opc3;
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
                militar.getRambos()[0].crear(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
                //militar.getRambos()[0].setRambo(rambo);
                System.out.println("Tropa RAMBO creada");
                break;
            case 2:
                if(militar.getEscuadrones().isEmpty()!=true){
                    menu.mostrarFabsEscuadron();
                    System.out.print("\nIngrese la clave de la Fabrica donde se creara la tropa: ");
                    opc3 = leer.nextInt();
                    System.out.println("Size: "+militar.getEscuadrones().size());
                    if(opc3>0 && opc3<=militar.getEscuadrones().size()){
                        Militar escuadron = factory1.getMilitar("escuadron");
                        militar.getEscuadrones().get(opc3).crear(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
                    }
                    else{
                        System.out.print("\nClave erronea ");
                    }
                }else{
                    System.out.print("\nNo existen fabricas de escuadrones ");
                }
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
    
    public void entrenarRevo(){
        int opc;
        System.out.println("\n---MENU ENTRENAR TROPAS O TRANSPORTE DE REVOLUCIONARIO---\n");
        System.out.println("1. Entrenar Fidel Castro");
        System.out.println("2. Entrenar Batallon");
        System.out.println("3. Crear Helicoptero");
        System.out.println("4. Crear Moto");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                Revolucionario castro = factory1.getRevolucionario("castro");
                revolucionario.getCastros()[0].crear(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
                System.out.println("Tropa castro creada");
                break;
            case 2:
                Revolucionario batallon = factory1.getRevolucionario("batallon");
                revolucionario.getBatallones().get(1).crear(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
                break;
            case 3:
                Revolucionario helicoptero = factory1.getRevolucionario("helicoptero");
                revolucionario.getHelicopteros().get(1).crear(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
                break;
            case 4:
                Revolucionario moto = factory1.getRevolucionario("moto");
                revolucionario.getMotos().get(1).crear(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
                break;
            default:
                break;
        }
    }
    
    public void entrenarTerro(){
        int opc;
        System.out.println("\n---MENU ENTRENAR TROPAS O TRANSPORTE DE TERRORISTA---\n");
        System.out.println("1. Entrenar BinLaden");
        System.out.println("2. Entrenar Bus");
        System.out.println("3. Crear Secta");
        System.out.println("4. Crear Tanque");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                Terrorista bin = factory1.getTerrorista("binladen");
                terrorista.getBins()[0].crear(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
                System.out.println("Tropa binladen creada");
                break;
            case 2:
                Revolucionario bus = factory1.getRevolucionario("bus");
                terrorista.getBuses().get(1).crear(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
                break;
            case 3:
                Revolucionario secta = factory1.getRevolucionario("secta");
                terrorista.getSectas().get(1).crear(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
                break;
            case 4:
                Revolucionario tanque = factory1.getRevolucionario("tanque");
                terrorista.getTanques().get(1).crear(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
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
    
    public void mejorarCMREV(){
        if(est2==0){
            revolucionario.mejora1(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
        }
        else if(est2==1){
            revolucionario.mejora2(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
        }
        else if(est2==2){
            revolucionario.mejora3(revolucionario.getRecurso1(), revolucionario.getRecurso2(), revolucionario.getRecurso3());
        }
        est2=est2+1;
    }
    
    public void mejorarCMTERR(){
        if(est3==0){
            terrorista.mejora1(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
        }
        else if(est3==1){
            terrorista.mejora2(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
        }
        else if(est3==2){
            terrorista.mejora2(terrorista.getRecurso1(), terrorista.getRecurso2(), terrorista.getRecurso3());
        }
        est3=est3+1;
    }
    
    public void mostrarFabsVehi(){
        Iterator it = militar.getVehiculos().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Vehiculo "+key+"\n");
            System.out.println("Vehiculos: Fabrica "+key+"\n");
            if (militar.getVehiculos().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarVehi(key);
            }
        }
        
        
    }
    
    public void mostrarFabsEscuadron(){
        Iterator it = militar.getEscuadrones().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Escuadron "+key+"\n");
            System.out.println("Escuadrones: Fabrica "+key+"\n");
            if (militar.getEscuadrones().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarEscua(key);
            }
        }
    }
    
    public void mostrarFabsConvoy(){
        Iterator it = militar.getConvoys().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Convoy "+key+"\n");
            System.out.println("Convoys: Fabrica "+key+"\n");
            if (militar.getConvoys().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarConvoy(key);
            }
        }
    }
    
    public void mostrarFabsRambo(){
        System.out.println("Clave: 1 -> Valor: Fabrica Rambo");
    }
    
    public void mostrarVehi(int keyVehi){
        Iterator it = militar.getVehiculos().get(keyVehi).getVehiculos().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Vehiculo "+key);
        }
    }
    
    public void mostrarConvoy(int keyCon){
        Iterator it = militar.getConvoys().get(keyCon).getConvoys().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Vehiculo "+key);
        }
    }
    
    public void mostrarEscua(int keyEsc){
        Iterator it = militar.getEscuadrones().get(keyEsc).getEscuadrones().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Vehiculo "+key);
        }
    }
    
    public void mostrarFabsBatallon(){
        Iterator it = revolucionario.getBatallones().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Batallon "+key+"\n");
            System.out.println("Batallones: Fabrica "+key+"\n");
            if (revolucionario.getBatallones().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarBatallon(key);
            }
        }
    }
    
    public void mostrarFabsHelicoptero(){
        Iterator it = revolucionario.getHelicopteros().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Helicoptero "+key+"\n");
            System.out.println("Helicopteros: Fabrica "+key+"\n");
            if (revolucionario.getHelicopteros().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarHelicoptero(key);
            }
        }
    }
    
    public void mostrarFabsMoto(){
        Iterator it = revolucionario.getMotos().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Moto "+key+"\n");
            System.out.println("Helicopteros: Fabrica "+key+"\n");
            if (revolucionario.getMotos().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarMoto(key);
            }
        }
    }
    
    public void mostrarFabsCastro(){
        System.out.println("Clave: 1 -> Valor: Fabrica Castro");
    }
    
    public void mostrarBatallon(int keyBat){
        Iterator it = revolucionario.getBatallones().get(keyBat).getBatallones().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Batallon "+key);
        }
    }
    
    public void mostrarHelicoptero(int keyHeli){
        Iterator it = revolucionario.getHelicopteros().get(keyHeli).getHelicopteros().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Helicoptero "+key);
        }
    }
    
    public void mostrarMoto(int keyMoto){
        Iterator it = revolucionario.getMotos().get(keyMoto).getMotos().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Moto "+key);
        }
    }
    
    public void mostrarFabsBus(){
        Iterator it = terrorista.getBuses().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Bus "+key+"\n");
            System.out.println("Bus: Fabrica "+key+"\n");
            if (terrorista.getBuses().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarBus(key);
            }
        }
    }
    
    public void mostrarFabsSecta(){
        Iterator it = terrorista.getSectas().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Secta "+key+"\n");
            System.out.println("Secta: Fabrica "+key+"\n");
            if (terrorista.getSectas().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarSecta(key);
            }
        }
    }
    
    public void mostrarFabsTanque(){
        Iterator it = terrorista.getTanques().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Fabrica Tanque "+key+"\n");
            System.out.println("Tanque: Fabrica "+key+"\n");
            if (terrorista.getTanques().isEmpty() == true) {
                System.out.println("NO HAY \n");
            } else {
                menu.mostrarTanque(key);
            }
        }
    }
    
    public void mostrarFabsBinLaden(){
        System.out.println("Clave: 1 -> Valor: Fabrica BinLaden");
    }
    
    public void mostrarBus(int keyBus){
        Iterator it = terrorista.getBuses().get(keyBus).getBuses().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Bus "+key);
        }
    }
    
    public void mostrarTanque(int keyTan){
        Iterator it = terrorista.getTanques().get(keyTan).getTanques().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Tanque "+key);
        }
    }
    
    public void mostrarSecta(int keySec){
        Iterator it = terrorista.getSectas().get(keySec).getSectas().keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: "+key+" -> Valor: Secta "+key);
        }
    }
    
    public void atacarFabMilitar(int pAta){
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
                life= militar.getVehiculos().get(opc2).getVida();
                militar.getVehiculos().get(opc2).setVida(life-pAta);
                if(militar.getVehiculos().get(opc2).getVida()<=0){
                    militar.getVehiculos().remove(opc2);
                }
                break;
            case 2:
                menu.mostrarFabsConvoy();
                System.out.print("\nIngrese la clave de la Fabrica de Convoy a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getConvoys().get(opc2).getVida();
                militar.getConvoys().get(opc2).setVida(life-pAta);
                if(militar.getConvoys().get(opc2).getVida()<=0){
                    militar.getConvoys().remove(opc2);
                }
                break;
            case 3:
                menu.mostrarFabsEscuadron();
                System.out.print("\nIngrese la clave de la Fabrica de Escuadron a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getEscuadrones().get(opc2).getVida();
                militar.getEscuadrones().get(opc2).setVida(life-pAta);
                if(militar.getEscuadrones().get(opc2).getVida()<=0){
                    militar.getEscuadrones().remove(opc2);
                }
                break;
            case 4:
                menu.mostrarFabsRambo();
                System.out.print("\nIngrese la clave de la Fabrica de Rambo a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getRambos()[0].getVida();
                militar.getRambos()[0].setVida(life-pAta);
                if(militar.getRambos()[0].getVida()<=0){
                    militar.getRambos()[0]=null;
                }
                break;
            default:
                System.out.print("\nEleccion Erronea ");
                break;
        }
    }
    
    public void atacarFabRevolucionario(int pAta){
        int opc1,opc2,key=0,life;
        
        System.out.println("Elija el tipo de fabrica a atacar: \n");
        System.out.println("1.Fabrica de Batallon");
        System.out.println("2.Fabrica de Helicoptero");
        System.out.println("3.Fabrica de Moto");
        System.out.println("4.Fabrica de Castro");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc1 = leer.nextInt();
        
        switch (opc1) {
            case 1:
                menu.mostrarFabsBatallon();
                System.out.print("\nIngrese la clave de la Fabrica de Batallon a atacar: ");
                opc2 = leer.nextInt();
                life=revolucionario.getBatallones().get(opc2).getVida();
                revolucionario.getBatallones().get(opc2).setVida(life-pAta);
                if(revolucionario.getBatallones().get(opc2).getVida()<=0){
                    revolucionario.getBatallones().remove(opc2);
                }
                break;
            case 2:
                menu.mostrarFabsHelicoptero();
                System.out.print("\nIngrese la clave de la Fabrica de Helicoptero a atacar: ");
                opc2 = leer.nextInt();
                life=revolucionario.getHelicopteros().get(opc2).getVida();
                revolucionario.getHelicopteros().get(opc2).setVida(life-pAta);
                if(revolucionario.getHelicopteros().get(opc2).getVida()<=0){
                    revolucionario.getHelicopteros().remove(opc2);
                }
                break;
            case 3:
                menu.mostrarFabsMoto();
                System.out.print("\nIngrese la clave de la Fabrica de Moto a atacar: ");
                opc2 = leer.nextInt();
                life=revolucionario.getMotos().get(opc2).getVida();
                revolucionario.getMotos().get(opc2).setVida(life-pAta);
                if(revolucionario.getMotos().get(opc2).getVida()<=0){
                    revolucionario.getMotos().remove(opc2);
                }
                break;
            case 4:
                menu.mostrarFabsCastro();
                System.out.print("\nIngrese la clave de la Fabrica de Castro a atacar: ");
                opc2 = leer.nextInt();
                life=revolucionario.getCastros()[0].getVida();
                revolucionario.getCastros()[0].setVida(-pAta);
                if(revolucionario.getCastros()[0].getVida()<=0){
                    revolucionario.getCastros();
                }
                break;
            default:
                System.out.print("\nEleccion Erronea ");
                break;
        }
    }
    
    public void atacarFabTerrorista(int pAta){
        int opc1,opc2,key=0,life;
        
        System.out.println("Elija el tipo de fabrica a atacar: \n");
        System.out.println("1.Fabrica de Bus");
        System.out.println("1.Fabrica de Secta");
        System.out.println("1.Fabrica de Tanque");
        System.out.println("1.Fabrica de BinLaden");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc1 = leer.nextInt();
        
        switch (opc1) {
            case 1:
                menu.mostrarFabsBus();
                System.out.print("\nIngrese la clave de la Fabrica de Bus a atacar: ");
                opc2 = leer.nextInt();
                life= terrorista.getBuses().get(opc2).getVida();
                terrorista.getBuses().get(opc2).setVida(life-pAta);
                if(terrorista.getBuses().get(opc2).getVida()<=0){
                    terrorista.getBuses().remove(opc2);
                }
                break;
            case 2:
                menu.mostrarFabsSecta();
                System.out.print("\nIngrese la clave de la Fabrica de Secta a atacar: ");
                opc2 = leer.nextInt();
                life= terrorista.getSectas().get(opc2).getVida();
                terrorista.getSectas().get(opc2).setVida(life-pAta);
                if(terrorista.getSectas().get(opc2).getVida()<=0){
                    terrorista.getSectas().remove(opc2);
                }
                break;
            case 3:
                menu.mostrarFabsTanque();
                System.out.print("\nIngrese la clave de la Fabrica de Tanque a atacar: ");
                opc2 = leer.nextInt();
                life= terrorista.getTanques().get(opc2).getVida();
                terrorista.getTanques().get(opc2).setVida(life-pAta);
                if(terrorista.getTanques().get(opc2).getVida()<=0){
                    terrorista.getTanques().remove(opc2);
                }
                break;
            case 4:
                menu.mostrarFabsBinLaden();
                System.out.print("\nIngrese la clave de la Fabrica de BinLaden a atacar: ");
                opc2 = leer.nextInt();
                life=terrorista.getBins()[0].getVida();
                terrorista.getBins()[0].setVida(life-pAta);
                if(terrorista.getBins()[0].getVida()<=0){
                    terrorista.getBins()[0]=null;
                    militar.getRambos()[0]=null;
                }
                break;
            default:
                System.out.print("\nEleccion Erronea ");
                break;
        }
    }
    /*
    public void showFabMi(){
        System.out.println("FABRICAS DISPONIBLES A ATACAR");
        System.out.println("1. Fabrica de Escuadron");
        System.out.println("2. Fabrica de Convoy");
        System.out.println("3. Fabrica de Vehiculo");
        System.out.println("4. Fabrica de Rambo");
        System.out.println("5. Recolector de Efectivo");
        System.out.println("6. Recolector de Oro");
        System.out.println("7. Generador de Diamante");
    }
    public void showFabRe(){
        System.out.println("FABRICAS DISPONIBLES A ATACAR");
        System.out.println("1. Fabrica de Batallon");
        System.out.println("2. Fabrica de Helicoptero");
        System.out.println("3. Fabrica de Moto");
        System.out.println("4. Fabrica de Castro");
        System.out.println("5. Recolector de Metal");
        System.out.println("6. Recolector de Plata");
        System.out.println("7. Generador de BitCoins");
    }
    public void showFabTe(){
        System.out.println("FABRICAS DISPONIBLES A ATACAR");
        System.out.println("1. Fabrica de Bus");
        System.out.println("2. Fabrica de Secta");
        System.out.println("3. Fabrica de Tanque");
        System.out.println("4. Fabrica de BinLaden");
        System.out.println("5. Recolector de Petroleo");
        System.out.println("6. Recolector de Quimicos");
        System.out.println("7. Generador de Monedas");
    }*/
}
