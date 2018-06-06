/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletons;

import EdificacionesMilitar.FabricaConvoy;
import EdificacionesMilitar.FabricaEscuadron;
import EdificacionesMilitar.FabricaRambo;
import EdificacionesMilitar.FabricaVehiculo;
import RecursoMilitar.GeneradorDiamante;
import RecursoMilitar.RecolectorEfectivo;
import RecursoMilitar.RecolectorOro;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class SingletonMilitar {
    int c=1,v=1,es=1,d=1,o=1,ef=1;
    private static SingletonMilitar instance;
    private Map<Integer,FabricaConvoy> convoys = new HashMap<Integer,FabricaConvoy>();
    private Map<Integer,FabricaVehiculo> vehiculos = new HashMap<Integer,FabricaVehiculo>();
    private Map<Integer,FabricaEscuadron> escuadrones = new HashMap<Integer,FabricaEscuadron>();
    private Map<Integer,GeneradorDiamante> diamantes = new HashMap<Integer,GeneradorDiamante>();
    private Map<Integer,RecolectorOro> oros = new HashMap<Integer,RecolectorOro>();
    private Map<Integer,RecolectorEfectivo> efectivos = new HashMap<Integer,RecolectorEfectivo>();
    private FabricaRambo[] rambos = new FabricaRambo[1];
    
    public static SingletonMilitar getInstance(){
        if(instance==null){
            instance= new SingletonMilitar();
        }
        else{
            System.out.println("Objeto ya existente");
        }
        return instance;
    }

    public SingletonMilitar() {
    }
    
    public Map<Integer, FabricaConvoy> getConvoys() {
        return convoys;
    }

    public void setConvoys(FabricaConvoy val) {
        this.convoys.put(c, val);
        c=c+1;
    }

    public Map<Integer, FabricaVehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(FabricaVehiculo val) {
        this.vehiculos.put(v, val);
        v=v+1;
    }

    public Map<Integer, FabricaEscuadron> getEscuadrones() {
        return escuadrones;
    }

    public void setEscuadrones(FabricaEscuadron val) {
        this.escuadrones.put(es, val);
        es=es+1;
    }

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

    public FabricaRambo[] getRambos() {
        return rambos;
    }

    public void setRambos(FabricaRambo val) {
        if (rambos[0]==null){
            this.rambos[0]=val;
        }
        else{
            System.out.println("Soldado ya existente");
        }
    }
    
    
}

