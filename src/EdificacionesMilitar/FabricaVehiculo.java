/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesMilitar;

import Militar.Militar;
import Militar.Vehiculo;
import Singletons.Fase;
import Singletons.SingletonMilitar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author EdwinLovo
 */
public class FabricaVehiculo{
    int faseAlmacenada, vida=500,ind=1;
    Fase fase = Fase.getInstance();
    SingletonMilitar militares = SingletonMilitar.getInstance();
    private Map<Integer,Vehiculo> vehiculos = new HashMap<Integer,Vehiculo>();

    public FabricaVehiculo(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }

    public Map<Integer, Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Map<Integer, Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFaseAlmacenada() {
        return faseAlmacenada;
    }

    public void setFaseAlmacenada(int faseAlmacenada) {
        this.faseAlmacenada = faseAlmacenada;
    }
    /*
    @Override
    public void atacar() {
    }

    @Override
    public int recolectar() {
        return 0;
    }*/

    
    public void crear(int r1, int r2, int r3) {
        System.out.println("Crear");
        if(r1>=200 && r2>=200){
            Vehiculo vehi = new Vehiculo();
            vehiculos.put(ind, vehi);
            ind+=1;
            militares.setRecurso1(-200);
            militares.setRecurso2(-200);
            System.out.println("Vehiculo creado");
        }
        else{
            System.out.println("Recursos insuficientes");
        }
    }
    
}
