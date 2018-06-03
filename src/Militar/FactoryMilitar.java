/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Militar;

import AbstractFactory.AbstractFactory;
import RecursoMilitar.Diamante;
import RecursoMilitar.Efectivo;
import RecursoMilitar.Oro;

/**
 *
 * @author EdwinLovo
 */
public class FactoryMilitar implements AbstractFactory{

    @Override
    public Militar getMilitar(String type) {
        switch (type){
            case "efectivo":
                return new Efectivo();
            case "oro":
                return new Oro();
            case "diamante":
                return new Diamante();
            case "convoy":
                return new Convoy();
            case "vehiculo":
                return new Vehiculo();
            case "escuadron":
                return new Escuadron();
            case "rambo":
                return new Rambo();
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
