/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revolucionario;

import AbstractFactory.AbstractFactory;
import MiliciaRevolucionario.Batallon;
import MiliciaRevolucionario.Castro;
import Militar.Militar;
import RecursoRevolucionario.BitCoins;
import RecursoRevolucionario.Metal;
import RecursoRevolucionario.Plata;
import Terrorista.Terrorista;
import TransporteRevolucionario.Helicoptero;
import TransporteRevolucionario.Moto;

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
                return new BitCoins();
            case "metal":
                return new Metal();
            case "plata":
                return new Plata();
            case "helicoptero":
                return new Helicoptero();
            case "moto":
                return new Moto();
            case "batallon":
                return new Batallon();
            case "castro":
                return new Castro();
        }
        return null;
    }

    @Override
    public Terrorista getTerrorista(String type) {
        return null;
    }
    
}
