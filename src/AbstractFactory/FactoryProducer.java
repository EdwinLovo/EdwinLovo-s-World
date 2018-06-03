/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Militar.FactoryMilitar;

/**
 *
 * @author EdwinLovo
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "militar":
                return new FactoryMilitar();
            case "revolucionario":
                return new FactoryRevolucionario();
            case "terrorista":
                return new FactoryRevolucionario();
        }
        return null;
    }
}
