
package Inheritance.ACCESS;


public class A {
 
    int num;
        String name;
        int arr[];
       
        public int getNuum(){
            
            return num;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        
       public A(int num ,String name){
           this.num=num;
           this.name=name;
           this.arr=new int[num];
       } 
       
       
}
