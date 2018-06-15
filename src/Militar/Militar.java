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
    public void atacar(int j);
    public void defender(int j);
    public int getVida();
    public void setVida(int vida);
}
