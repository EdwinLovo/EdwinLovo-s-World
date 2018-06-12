/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singletons;

/**
 *
 * @author EdwinLovo
 */
public class Fase {
    private static Fase instance;
    private static int fase=1;

    public Fase() {
    }
    
    public static Fase getInstance(){
        if(instance==null){
            instance= new Fase();
        }
        else{
            System.out.println("Objeto ya existente");
        }
        return instance;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        Fase.fase = fase;
    }
    
}
