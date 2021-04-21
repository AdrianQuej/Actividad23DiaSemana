/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad23diasemana;

import java.util.Scanner;

/**
 *
 * @author Adrian Quej
 */
public class Actividad23DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String dia;
       System.out.println("Este programa te dirá si el dia de la semana es habil o es fin de semana");
       Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana: ");
        dia = miConsola.nextLine();; 
        
        switch(dia){
        
            case "lunes","martes","miercoles","jueves","viernes":
                System.out.println("Es dia habil");
                break;
            case "LUNES","MARTES","MIERCOLES","JUEVES","VIERNES":
                System.out.println("Es dia habil");
                break;
            case "Lunes","Martes","Miercoles","Jueves","Viernes":
                System.out.println("Es dia habil");
                break;
            case "Sabado","Domingo":
                System.out.println("Es fin de semana");
                break;
            case "SABADO","DOMINGO":
                System.out.println("Es fin de semana");
                break;
            case "sabado","domingo":
                System.out.println("Es fin de semana");
                break;
             default :
                 System.out.println("Debes escribir bien el nombre dia sin acento");
    }
    }
    
}
