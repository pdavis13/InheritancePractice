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
public class IrrationalNumber extends RealNumber{
    private boolean isTranscendental;
    private int roundedValue;
            
    private String getString(){
        return Double.toString(value);
    }
}
