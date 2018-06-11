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
import Singletons.Fase;
import Terrorista.Terrorista;

/**
 *
 * @author EdwinLovo
 */
public class FactoryMilitar implements AbstractFactory{
    Fase fase = Fase.getInstance();
    @Override
    public Militar getMilitar(String type) {
        switch (type){
            case "efectivo":
                return new RecolectorEfectivo(fase.getFase());
            case "oro":
                return new RecolectorOro(fase.getFase());
            case "diamante":
                return new GeneradorDiamante(fase.getFase());
            /*case "convoy":
                return new FabricaConvoy(fase.getFase());
            case "vehiculo":
                return new FabricaVehiculo(fase.getFase());
            case "escuadron":
                return new FabricaEscuadron(fase.getFase());
            case "rambo":
                return new FabricaRambo(fase.getFase());*/
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
