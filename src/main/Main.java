package main;

import view.ListagemProcesso;
import view.TelaLogin;


/**
 *
 * @author Kito Mahique
 */
public class Main {
    
    public static void main(String[] args){
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });        
    }
    
}
