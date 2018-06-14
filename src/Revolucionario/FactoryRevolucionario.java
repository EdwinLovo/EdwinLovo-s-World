
package Revolucionario;

import AbstractFactory.AbstractFactory;
import EdificacionesRevolucionario.FabricaBatallon;
import EdificacionesRevolucionario.FabricaCastro;
import EdificacionesRevolucionario.FabricaHelicoptero;
import EdificacionesRevolucionario.FabricaMoto;
import Militar.Militar;
import EdificacionesRevolucionario.GeneradorBitCoins;
import EdificacionesRevolucionario.RecolectorMetal;
import EdificacionesRevolucionario.RecolectorPlata;
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
