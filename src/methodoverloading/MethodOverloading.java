/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

import java.util.Scanner;

/**
 *
 * @author Spy Hacker
 */

class Method{
    
    double radius;
    double pi = 3.1416;
    double circle;
    
    void circle(){
        System.out.println("No Perameter"); 
    }
    void circle(double radius){
        System.out.println("Radius is: "+radius); 
    }
    
    void circle(double radius, double pi){        
        System.out.println("Radius is: "+pi*radius); 
    }
    
    void circle(double radius, double pi, double circle){        
        System.out.println("Radius is: "+pi*radius*radius); 
    }

   
    
}

public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnrObj = new Scanner(System.in);
        Method crtObj = new Method();  
        
        System.out.print("Enter radius: ");
        crtObj.radius = scnrObj.nextInt();
        crtObj.circle();
        crtObj.circle(crtObj.radius);
        crtObj.circle(crtObj.radius, crtObj.pi);
        crtObj.circle(crtObj.radius, crtObj.pi, crtObj.circle);
        
    }
    
}
