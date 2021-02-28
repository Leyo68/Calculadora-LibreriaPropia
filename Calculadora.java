
package CalculadoraL;//Paquete a la que pertenece la clase prueba

import Libreria.LibreriaCalculadora;//Importación de la librería creada personalmente

import javax.swing.*;//Se impota toda la libereria swing

public class Calculadora {//Inicio de la clase principal
    	public static void main (String[] args){//Método main del programa
    		//Se declaran Variables enteras
    		int opc;
                int opcion;
    		int a,b,resultado;    	
                
                //  Se instancia la clase LibreriaCalculadora de la librería creada
                LibreriaCalculadora operaciones= new LibreriaCalculadora();
                
                do{
    		//Se convierten las variables 
    		a=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese el primer numero"));
    		b=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese el segundo numero"));
                

    		// Se construye un menu para mostrar los numeros dados, y la operacion que se desea realizar
    		opc=Integer.parseInt(JOptionPane.showInputDialog ("Opciones\n 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4.Division"));
                
    		switch(opc){//Se captura la opcion
    			
    		//Se comienzan a declarar los casos
    			case 1:
    				resultado=operaciones.suma(a,b);//Se guarda el valor de la suma en la variable resultado
    				JOptionPane.showMessageDialog(null,"La suma es: " + resultado);//Se immprime el resultado en ventana
    				break;//Se termina la ejecución del case 1
    				
    			case 2:
    				resultado=operaciones.resta(a,b);//Se guarda el valor de la resta en la variable resultado
    				JOptionPane.showMessageDialog(null,"La resta es: " + resultado);//Se immprime el resultado en ventana
    				break;//Se termina la ejecución del case 2
    				
    			case 3:
    				resultado=operaciones.multiplicacion(a,b);//Se guarda el valor de la multiplicacion en la variable resultado
    				JOptionPane.showMessageDialog(null,"La multiplicacion es: " + resultado);//Se immprime el resultado en ventana
    				break;//Se termina la ejecución del case 3
    				
    			case 4:
    				resultado=operaciones.division(a,b);//Se guarda el valor de la division en la variable resultado
    				JOptionPane.showMessageDialog(null,"La division es: " + resultado);//Se immprime el resultado en ventana
    				break;//Se termina la ejecución del case 4
    		}
                //Pregunta al usuario si desea realizar alguna otra operación
                opcion=Integer.parseInt(JOptionPane.showInputDialog ("¿Desea realizar otra operación?\n 1. Si\n 2. No\n (Ingrese sólo números)"));
                
                }while(opcion==1);
                JOptionPane.showMessageDialog(null,"            ¡LINDO DÍA!");
    	}
}