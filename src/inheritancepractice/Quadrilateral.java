/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author pdavis13
 */
public class Quadrilateral {
    private double angleA;
    private double angleB;
    private double angleC;
    private double angleD;
    
    private void setAnglesParallel(){
        angleA = angleB;
        angleC = angleD;
    }
}
