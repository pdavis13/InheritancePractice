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
public class RealNumber {
    protected double value;
    private String expression;
    
    private double multiply(int factor){
        return value*factor;
    }
}
