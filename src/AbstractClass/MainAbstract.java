/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author vishal chandravanshi
 */
public class MainAbstract  {
    public static void main(String[] args) {
        DaughterAbstraction day=new DaughterAbstraction("shuhani",23);
        SonAbstract son=new SonAbstract(19,99);
        day.career();
        day.partner();
        son.career();
        son.partner();
      SonAbstract.normal();
      day.normal();
      
    }
}
