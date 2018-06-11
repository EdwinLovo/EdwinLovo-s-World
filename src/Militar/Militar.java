/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Militar;

import Singletons.Fase;

/**
 *
 * @author EdwinLovo
 */
public interface Militar {
    public void atacar();
    public int recolectar();
    public int getVida();
    public void setVida(int vida);
    public void crear(int r1, int r2, int r3);
}
