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
public class DarthVader extends Villain{
    private boolean hasHelmet;
    private String voiceLine;
    
    private void forceChoke(Character chara){
        chara.die();
    }
}
