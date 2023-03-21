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
public abstract class Parent {
    final int v;
    int age;
     Parent(int age)
    {
        this.age=age;
        v=455344;
              System.out.println("i am parent class constructor "+age);
    }
    abstract void career();
    abstract void partner();
    static void normal()
    {
        System.out.println("i am normal method of abstract class ");
    }
}
