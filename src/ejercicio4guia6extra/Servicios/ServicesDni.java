/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4guia6extra.Servicios;

import ejercicio4guia6extra.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author KAZAMA
 * 
 * 
 * 
 * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
* 
* 
* 
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
 */
public class ServicesDni {
    
    
    public static NIF crearNif(){
        
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese su DNI");
        
        int dni = read.nextInt();
        
        int res = dni% 23;
        
        String[] vector= new String[]{"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        String letraString = vector[res];
        
        char letra = letraString.charAt(0);
        
    return new NIF(dni,letra);
    }
    
    
    public static void mostrar(int dni , char letra){
        
        System.out.println("DNI: "+dni+"-"+letra);
     
    } 
}
