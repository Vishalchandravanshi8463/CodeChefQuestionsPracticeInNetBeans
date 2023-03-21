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
public class SonAbstract extends Parent {
    int marks;
    SonAbstract(int age,int marks){
        super(age);
        this.marks=marks;     
  
    }
    @Override
    void career(){
        System.out.println("i want to be a coder "+age);
    }
    @Override
    void partner(){
        System.out.println("i love genius  ");
    }

   
}
