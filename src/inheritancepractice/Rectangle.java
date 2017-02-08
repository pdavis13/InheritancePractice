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
public class Rectangle extends Quadrilateral{
    private double length;
    private double width;
    
    private double getArea(){
        return length*width;
    }
}
