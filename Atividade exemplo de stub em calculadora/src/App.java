
import model.Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas Ribeiro
 */
public class App {
    
    public static void main (String [] Args){
        
        Calculadora cal = new Calculadora();
        CalculadoraInterface calInter = new CalculadoraStub();
        
        System.out.println(calInter.subrair(20, 10));
    }
}