/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrorista;

import AbstractFactory.AbstractFactory;
import EdificacionesTerrorista.FabricaBinLaden;
import EdificacionesTerrorista.FabricaBus;
import EdificacionesTerrorista.FabricaSecta;
import EdificacionesTerrorista.FabricaTanque;
import Militar.Militar;
import RecursoTerrorista.GeneradorMonedas;
import RecursoTerrorista.RecolectorPetroleo;
import RecursoTerrorista.RecolectorQuimicos;
import Revolucionario.Revolucionario;

/**
 *
 * @author EdwinLovo
 */
public class FactoryTerrorista implements AbstractFactory{

    @Override
    public Militar getMilitar(String type) {
        return null;
    }

    @Override
    public Revolucionario getRevolucionario(String type) {
        return null;
    }

    @Override
    public Terrorista getTerrorista(String type) {
        switch (type){
            case "petroleo":
                return new RecolectorPetroleo();
            case "quimicos":
                return new RecolectorQuimicos();
            case "monedas":
                return new GeneradorMonedas();
            case "tanque":
                return new FabricaTanque();
            case "bus":
                return new FabricaBus();
            case "secta":
                return new FabricaSecta();
            case "binladen":
                return new FabricaBinLaden();
        }
        return null;
    }
    
}
