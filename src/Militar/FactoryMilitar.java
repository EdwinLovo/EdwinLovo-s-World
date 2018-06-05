/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Militar;

import AbstractFactory.AbstractFactory;
import EdificacionesMilitar.FabricaConvoy;
import EdificacionesMilitar.FabricaEscuadron;
import EdificacionesMilitar.FabricaRambo;
import EdificacionesMilitar.FabricaVehiculo;
import RecursoMilitar.GeneradorDiamante;
import RecursoMilitar.RecolectorEfectivo;
import RecursoMilitar.RecolectorOro;
import Revolucionario.Revolucionario;
import Terrorista.Terrorista;

/**
 *
 * @author EdwinLovo
 */
public class FactoryMilitar implements AbstractFactory{

    @Override
    public Militar getMilitar(String type) {
        switch (type){
            case "efectivo":
                return new RecolectorEfectivo();
            case "oro":
                return new RecolectorOro();
            case "diamante":
                return new GeneradorDiamante();
            case "convoy":
                return new FabricaConvoy();
            case "vehiculo":
                return new FabricaVehiculo();
            case "escuadron":
                return new FabricaEscuadron();
            case "rambo":
                return new FabricaRambo();
        }
        return null;
    }

    @Override
    public Revolucionario getRevolucionario(String type) {
        return null;
    }

    @Override
    public Terrorista getTerrorista(String type) {
        return null;
    }
    
}
