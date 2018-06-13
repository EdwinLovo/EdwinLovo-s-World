/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terrorista;

import AbstractFactory.AbstractFactory;
import Militar.Militar;
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
            /*case "petroleo":
                return new RecolectorPetroleo();
            case "quimicos":
                return new RecolectorQuimicos();
            case "monedas":
                return new GeneradorMonedas();*/
            case "tanque":
                return new Tanque();
            case "bus":
                return new Bus();
            case "secta":
                return new Secta();
            case "binladen":
                return new BinLaden();
        }
        return null;
    }
    
}
