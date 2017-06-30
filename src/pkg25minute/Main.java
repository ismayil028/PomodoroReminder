/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25minute;

/**
 *
 * @author ismayil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    asd();
    }

    public static void asd() {
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                new RelaxPanel().setVisible(true);
            }
        },
                1500000
        );
    }
}
