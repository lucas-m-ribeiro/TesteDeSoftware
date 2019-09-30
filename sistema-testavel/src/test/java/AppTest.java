
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import javax.swing.JTextField;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Model.AcoesBotao;

public class AppTest {

    AcoesBotao act = new AcoesBotao();
  
    //Primeira sequencia de numeros correta
    @Test
    public void PrimeiraSequencia(){
        
        JTextField sequencia1 = new JTextField();
        sequencia1.setText("10,20,30,40");
        assertEquals(true, act.testarCampos(sequencia1));
    }
    
    //Segunda sequencia incorreta com 0 na frente
    @Test
    public void SegundaSequencia(){
        
        JTextField sequencia2 = new JTextField();
        sequencia2.setText("01,02,30,40");
        assertEquals(true, act.testarCampos(sequencia2));
    }
    
    //Terceira sequencia incorreta com numeros de 3 algarismos
    @Test
    public void TerceiraSequencia(){
        
        JTextField sequencia3 = new JTextField();
        sequencia3.setText("100,200,30,40");
        assertEquals(true, act.testarCampos(sequencia3));
    }

    //Quarta sequencia correta de numeros
    @Test
    public void QuartaSequencia(){
        
        JTextField sequencia4 = new JTextField();
        sequencia4.setText("20,30,40,50");
        assertEquals(true, act.testarCampos(sequencia4));
    }
}
