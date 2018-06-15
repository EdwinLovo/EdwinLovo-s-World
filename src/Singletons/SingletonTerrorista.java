
package Singletons;

import EdificacionesTerrorista.FabricaBinLaden;
import EdificacionesTerrorista.FabricaBus;
import EdificacionesTerrorista.FabricaSecta;
import EdificacionesTerrorista.FabricaTanque;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class SingletonTerrorista {
    private static int c=1,v=1,es=1,d=1,o=1,ef=1,recurso1,recurso2,recurso3,vida,limite1,limite2,limite3;
    private static SingletonTerrorista instance;
    Fase fase = Fase.getInstance();
    private Map<Integer,FabricaBus> buses = new HashMap<Integer,FabricaBus>();
    private Map<Integer,FabricaSecta> sectas = new HashMap<Integer,FabricaSecta>();
    private Map<Integer,FabricaTanque> tanques = new HashMap<Integer,FabricaTanque>();
    private Map<Integer,FabricaBinLaden> bins = new HashMap<Integer,FabricaBinLaden>();
    
    public static SingletonTerrorista getInstance(){
        if(instance==null){
            instance= new SingletonTerrorista(500,500,500,800,5000,4000,3000);
        }
        return instance;
    }

    public SingletonTerrorista(int recurso1, int recurso2, int recurso3, int vida, int limite1, int limite2, int limite3) {
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
        this.vida = vida;
        this.limite1 = limite1;
        this.limite2 = limite2;
        this.limite3 = limite3;
    }

    public Fase getFase() {
        return fase;
    }

    public void setFase(Fase fase) {
        this.fase = fase;
    }
    
    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        if((recurso1+this.recurso1)<=limite1){
            this.recurso1 = recurso1+this.recurso1;
        }
        else{
            this.recurso1=this.limite1;
            System.out.println("Almacen 1 lleno");
        }
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        if((recurso2+this.recurso2)<=limite2){
            this.recurso2 = recurso2+this.recurso2;
        }
        else{
            this.recurso2=this.limite2;
            System.out.println("Almacen 2 lleno");
        }
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        if((recurso3+this.recurso3)<=limite3){
            this.recurso3 = recurso3+this.recurso3;
        }
        else{
            this.recurso3=this.limite3;
            System.out.println("Almacen 3 lleno");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getLimite1() {
        return limite1;
    }

    public void setLimite1(int limite1) {
        this.limite1 = limite1;
    }

    public int getLimite2() {
        return limite2;
    }

    public void setLimite2(int limite2) {
        this.limite2 = limite2;
    }

    public int getLimite3() {
        return limite3;
    }

    public void setLimite3(int limite3) {
        this.limite3 = limite3;
    }

    public Map<Integer, FabricaBus> getBuses() {
        return buses;
    }
    
    public void setBuses(FabricaBus val) {
        this.buses.put(c, val);
        c=c+1;
    }

    public Map<Integer, FabricaSecta> getSectas() {
        return sectas;
    }

    public void setSectas(FabricaSecta val) {
        this.sectas.put(v, val);
        v=v+1;
    }

    public Map<Integer, FabricaTanque> getTanques() {
        return tanques;
    }

    public void setTanques(FabricaTanque val) {
        this.tanques.put(es, val);
        es=es+1;
    }

    public Map<Integer,FabricaBinLaden> getBins() {
        return bins;
    }


    public void setBins(FabricaBinLaden val) {
        if (bins.isEmpty()==true){
            this.bins.put(1, val);
        }
        else{
            System.out.println("Soldado ya existente");
        }
    }
    
    public void mejora1(int recurso1, int recurso2, int recurso3){
        if(recurso1>=1650 && recurso2>=1650 && recurso3>=1650){
            this.limite1 = 11000;
            this.limite2 = 5500;
            this.limite3 = 3300;
            this.recurso1 = this.recurso1-1650;
            this.recurso2 = this.recurso3-1650;
            this.recurso3 = this.recurso3-1650;
            System.out.println("Mejora 1 hecha");
        }
        else{
            System.out.println("No posee recursos suficientes");
        }
    }
    
    public void mejora2(int recurso1, int recurso2, int recurso3){
        if(recurso1>=2145 && recurso2>=2145 && recurso3>=2145){
            this.limite1 = 14300;
            this.limite2 = 7150;
            this.limite3 = 4290;
            this.recurso1 = this.recurso1-2145;
            this.recurso2 = this.recurso3-2145;
            this.recurso3 = this.recurso3-2145;
            System.out.println("Mejora 2 hecha");
        }
        else{
            System.out.println("No posee recursos suficientes");
        }
    }
    
    public void mejora3(int recurso1, int recurso2, int recurso3){
        if(recurso1>=3218 && recurso2>=3218 && recurso3>=3218){
            this.limite1 = 21450;
            this.limite2 = 10725;
            this.limite3 = 6435;
            this.recurso1 = this.recurso1-3218;
            this.recurso2 = this.recurso3-3218;
            this.recurso3 = this.recurso3-3218;
            System.out.println("Mejora 3 hecha");
        }
        else{
            System.out.println("No posee recursos suficientes");
        }
    }
}
