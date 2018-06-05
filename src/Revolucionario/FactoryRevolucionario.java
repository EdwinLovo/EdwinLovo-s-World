/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revolucionario;

import AbstractFactory.AbstractFactory;
import EdificacionesRevolucionario.FabricaBatallon;
import EdificacionesRevolucionario.FabricaCastro;
import EdificacionesRevolucionario.FabricaHelicoptero;
import EdificacionesRevolucionario.FabricaMoto;
import Militar.Militar;
import RecursoRevolucionario.GeneradorBitCoins;
import RecursoRevolucionario.RecolectorMetal;
import RecursoRevolucionario.RecolectorPlata;
import Terrorista.Terrorista;

/**
 *
 * @author EdwiLovo
 */
public class FactoryRevolucionario implements AbstractFactory{

    @Override
    public Militar getMilitar(String type) {
        return null;
    }

    @Override
    public Revolucionario getRevolucionario(String type) {
        switch (type){
            case "bitcoins":
                return new GeneradorBitCoins();
            case "metal":
                return new RecolectorMetal();
            case "plata":
                return new RecolectorPlata();
            case "aeropuerto":
                return new FabricaHelicoptero();
            case "moto":
                return new FabricaMoto();
            case "batallon":
                return new FabricaBatallon();
            case "castro":
                return new FabricaCastro();
        }
        return null;
    }

    @Override
    public Terrorista getTerrorista(String type) {
        return null;
    }
    
}
