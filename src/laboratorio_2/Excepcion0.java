/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_2;

/**
 *
 * @author User001
 */
public class Excepcion0 extends Exception{
    public Excepcion0 (String Message){
            super(Message);}
     public Excepcion0 (){
            super("No se puede realizar divisones entre 0");}
}
