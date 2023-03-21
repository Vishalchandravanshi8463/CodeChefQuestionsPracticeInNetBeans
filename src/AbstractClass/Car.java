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
public class Car implements Engine,Media,Brake {

    @Override
    public void start() {
        System.out.println("i am start like a normal ");
    }

    @Override
    public void stop() {
        System.out.println("i am stop like normal ");
    }

    @Override
    public void accelerator() {
        System.out.println("i am acc like normal");
    }

    @Override
    public void brake() {
        System.out.println("I AM brake like normal");
    }
    
    
}
