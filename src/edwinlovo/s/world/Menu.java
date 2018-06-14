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
import EdificacionesRevolucionario.FabricaBatallon;
import EdificacionesRevolucionario.FabricaCastro;
import EdificacionesRevolucionario.FabricaHelicoptero;
import EdificacionesRevolucionario.FabricaMoto;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import Singletons.SingletonRevolucionario;
import Singletons.SingletonTerrorista;
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
        System.out.println("7. Terminar turno");

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
            default:
                break;
        }
    }
    
    public void construirFabRev(){
        int opc;
        SingletonRevolucionario revolucionario= SingletonRevolucionario.getInstance();
        System.out.println("\n---MENU CONTRUIR FABRICAS DE MILITAR---\n");
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
    
    public void recogerRecMili(){
        int r1, r2;
        r1 = efectivo.recolectar();
        r2 = oro.recolectar();
        System.out.println("Efectivo recolectado: $"+r1);
        System.out.println("Oro recolectado: "+r2);
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
                militar.getRambos()[0].crear(militar.getRecurso1(), militar.getRecurso2(), militar.getRecurso3());
                //militar.getRambos()[0].setRambo(rambo);
                System.out.println("Tropa RAMBO creada");
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
    
    public void atacarFabMilitar(){
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
                militar.getVehiculos().get(opc2).setVida(life-100);
                if(militar.getVehiculos().get(opc2).getVida()<=0){
                    militar.getVehiculos().remove(opc2);
                }
                break;
            case 2:
                menu.mostrarFabsConvoy();
                System.out.print("\nIngrese la clave de la Fabrica de Convoy a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getConvoys().get(opc2).getVida();
                militar.getConvoys().get(opc2).setVida(life-100);
                if(militar.getConvoys().get(opc2).getVida()<=0){
                    militar.getConvoys().remove(opc2);
                }
                break;
            case 3:
                menu.mostrarFabsEscuadron();
                System.out.print("\nIngrese la clave de la Fabrica de Escuadron a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getEscuadrones().get(opc2).getVida();
                militar.getEscuadrones().get(opc2).setVida(life-100);
                if(militar.getEscuadrones().get(opc2).getVida()<=0){
                    militar.getEscuadrones().remove(opc2);
                }
                break;
            case 4:
                menu.mostrarFabsRambo();
                System.out.print("\nIngrese la clave de la Fabrica de Rambo a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getRambos()[0].getVida();
                militar.getRambos()[0].setVida(life-100);
                if(militar.getRambos()[0].getVida()<=0){
                    militar.getRambos()[0]=null;
                }
                break;
            default:
                System.out.print("\nEleccion Erronea ");
                break;
        }
    }
    
    public void atacarFabRevolucionario(){
        int opc1,opc2,key=0,life;
        
        System.out.println("Elija el tipo de fabrica a atacar: \n");
        System.out.println("1.Fabrica de Batallon");
        System.out.println("1.Fabrica de Helicoptero");
        System.out.println("1.Fabrica de Moto");
        System.out.println("1.Fabrica de Castro");
        
        Scanner leer = new Scanner(System.in);
        System.out.print("\nIngrese su opcion: ");
        opc1 = leer.nextInt();
        
        switch (opc1) {
            case 1:
                menu.mostrarFabsVehi();
                System.out.print("\nIngrese la clave de la Fabrica de Vehiculo a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getVehiculos().get(opc2).getVida();
                militar.getVehiculos().get(opc2).setVida(life-100);
                if(militar.getVehiculos().get(opc2).getVida()<=0){
                    militar.getVehiculos().remove(opc2);
                }
                break;
            case 2:
                menu.mostrarFabsConvoy();
                System.out.print("\nIngrese la clave de la Fabrica de Convoy a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getConvoys().get(opc2).getVida();
                militar.getConvoys().get(opc2).setVida(life-100);
                if(militar.getConvoys().get(opc2).getVida()<=0){
                    militar.getConvoys().remove(opc2);
                }
                break;
            case 3:
                menu.mostrarFabsEscuadron();
                System.out.print("\nIngrese la clave de la Fabrica de Escuadron a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getEscuadrones().get(opc2).getVida();
                militar.getEscuadrones().get(opc2).setVida(life-100);
                if(militar.getEscuadrones().get(opc2).getVida()<=0){
                    militar.getEscuadrones().remove(opc2);
                }
                break;
            case 4:
                menu.mostrarFabsRambo();
                System.out.print("\nIngrese la clave de la Fabrica de Rambo a atacar: ");
                opc2 = leer.nextInt();
                life= militar.getRambos()[0].getVida();
                militar.getRambos()[0].setVida(life-100);
                if(militar.getRambos()[0].getVida()<=0){
                    militar.getRambos()[0]=null;
                }
                break;
            default:
                System.out.print("\nEleccion Erronea ");
                break;
        }
    }
}
