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
public class DaughterAbstraction extends Parent {
    String name;
DaughterAbstraction(String name,int age)
{
    super(age);
    this.name=name;
}
    @Override
    void career() {
        System.out.println("i wanna became a doctor ."+name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void partner() {
       
            System.out.println("i love makeupppp");                                                                                                                                                                                                                                                                         
    }
    
}
