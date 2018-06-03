/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author EdwinLovo
 */
public class AbstractFactory {
    Militar getMilitar(String type);
    Revolucionario getRevolucionario(String type);
    Terrorista getTerrorista(String type);
}
