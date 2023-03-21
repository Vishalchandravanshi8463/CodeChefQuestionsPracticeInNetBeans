/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */

public class OOPS {
    class Car
    {
        public int a = 23;
    }
    static class suzuki extends Car
    {
        
    }
    public static void main(String[] args) {
        suzuki s = new suzuki();
        System.out.println(s.a);
    }
}
