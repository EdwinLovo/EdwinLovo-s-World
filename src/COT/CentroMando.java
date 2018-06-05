/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COT;

/**
 *
 * @author EdwinLovo
 */
public class CentroMando {
    int recurso1,recurso2,recurso3,vida,limite1,limite2,limite3;

    public CentroMando(int recurso1, int recurso2, int recurso3, int vida, int limite1, int limite2, int limite3) {
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
        this.vida = vida;
        this.limite1 = limite1;
        this.limite2 = limite2;
        this.limite3 = limite3;
    }

    public int getLimite1() {
        return limite1;
    }

    public void setLimite1(int limite1) {
        this.limite1 = limite1;
    }

    public int getLimite2() {
        return limite2;
    }

    public void setLimite2(int limite2) {
        this.limite2 = limite2;
    }

    public int getLimite3() {
        return limite3;
    }

    public void setLimite3(int limite3) {
        this.limite3 = limite3;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        if(recurso1<=limite1){
            this.recurso1 = recurso1+this.recurso1;
        }
        else{
            System.out.println("Almacen 1 lleno");
        }
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        if(recurso2<=limite2){
            this.recurso2 = recurso2+this.recurso2;
        }
        else{
            System.out.println("Almacen 2 lleno");
        }
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        if(recurso3<=limite3){
            this.recurso3 = recurso3+this.recurso3;
        }
        else{
            System.out.println("Almacen 3 lleno");
        }
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void mejora1(int recurso1, int recurso2, int recurso3){
        if(recurso1>=1650 && recurso2>=1650 && recurso3>=1650){
            this.limite1 = 11000;
            this.limite2 = 5500;
            this.limite3 = 3300;
            this.recurso1 = this.recurso1-1650;
            this.recurso2 = this.recurso3-1650;
            this.recurso3 = this.recurso3-1650;
            System.out.println("Mejora 1 hecha");
        }
        else{
            System.out.println("No posee recursos suficientes");
        }
    }
    
    public void mejora2(int recurso1, int recurso2, int recurso3){
        if(recurso1>=2145 && recurso2>=2145 && recurso3>=2145){
            this.limite1 = 14300;
            this.limite2 = 7150;
            this.limite3 = 4290;
            this.recurso1 = this.recurso1-2145;
            this.recurso2 = this.recurso3-2145;
            this.recurso3 = this.recurso3-2145;
            System.out.println("Mejora 2 hecha");
        }
        else{
            System.out.println("No posee recursos suficientes");
        }
    }
    
    public void mejora3(int recurso1, int recurso2, int recurso3){
        if(recurso1>=3218 && recurso2>=3218 && recurso3>=3218){
            this.limite1 = 21450;
            this.limite2 = 10725;
            this.limite3 = 6435;
            this.recurso1 = this.recurso1-3218;
            this.recurso2 = this.recurso3-3218;
            this.recurso3 = this.recurso3-3218;
            System.out.println("Mejora 3 hecha");
        }
        else{
            System.out.println("No posee recursos suficientes");
        }
    }
}
