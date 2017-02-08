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
public class e extends IrrationalNumber{
    private final double ESTIMATE = 2.718281;
    private final String DISCOVERER = "Jacob Bernoulli";
    
    private float getValue(int precision){
        float value = 1;
        while(precision > 0){
            //would actually need 1/factorial(precision)
            value += 1/precision;
            precision--;
        }
        return value;
    }
}
