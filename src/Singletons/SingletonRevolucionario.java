/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletons;

import EdificacionesRevolucionario.FabricaBatallon;
import EdificacionesRevolucionario.FabricaCastro;
import EdificacionesRevolucionario.FabricaHelicoptero;
import EdificacionesRevolucionario.FabricaMoto;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class SingletonRevolucionario {
    int c=1,v=1,es=1,d=1,o=1,ef=1,recurso1,recurso2,recurso3,vida,limite1,limite2,limite3;
    private static SingletonMilitar instance;
    Fase fase = Fase.getInstance();
    private Map<Integer,FabricaBatallon> batallones = new HashMap<Integer,FabricaBatallon>();
    private Map<Integer,FabricaHelicoptero> helicopteros = new HashMap<Integer,FabricaHelicoptero>();
    private Map<Integer,FabricaMoto> motos = new HashMap<Integer,FabricaMoto>();
    /*private Map<Integer,GeneradorDiamante> diamantes = new HashMap<Integer,GeneradorDiamante>();
    private Map<Integer,RecolectorOro> oros = new HashMap<Integer,RecolectorOro>();
    private Map<Integer,RecolectorEfectivo> efectivos = new HashMap<Integer,RecolectorEfectivo>();*/
    private FabricaCastro[] castros = new FabricaCastro[1];
    
    public static SingletonMilitar getInstance(){
        if(instance==null){
            instance= new SingletonMilitar(500,500,500,800,5000,4000,3000);
        }
        return instance;
    }

    public SingletonRevolucionario(int recurso1, int recurso2, int recurso3, int vida, int limite1, int limite2, int limite3) {
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

    public Map<Integer, FabricaBatallon> getBatallones() {
        return batallones;
    }
    
    public void setBatallones(FabricaBatallon val) {
        this.batallones.put(c, val);
        c=c+1;
    }

    public Map<Integer, FabricaHelicoptero> getHelicopteros() {
        return helicopteros;
    }

    public void setHelicopteros(FabricaHelicoptero val) {
        this.helicopteros.put(v, val);
        v=v+1;
    }

    public Map<Integer, FabricaMoto> getMotos() {
        return motos;
    }

    public void setMotos(FabricaMoto val) {
        this.motos.put(es, val);
        es=es+1;
    }
/*
    public Map<Integer, GeneradorDiamante> getDiamantes() {
        return diamantes;
    }

    public void setDiamantes(GeneradorDiamante val) {
        this.diamantes.put(d, val);
        d=d+1;
    }

    public Map<Integer, RecolectorOro> getOros() {
        return oros;
    }

    public void setOros(RecolectorOro val) {
        this.oros.put(o, val);
        o=o+1;
    }

    public Map<Integer, RecolectorEfectivo> getEfectivos() {
        return efectivos;
    }

    public void setEfectivos(RecolectorEfectivo val) {
        this.efectivos.put(ef, val);
        ef=ef+1;
    }
*/

    public FabricaCastro[] getCastros() {
        return castros;
    }

    public void setCastros(FabricaCastro val) {
        if (castros[0]==null){
            this.castros[0]=val;
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
