/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lol;

/**
 *
 * @author mkmon_000
 */
import java.util.Scanner;
public class Lol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        lmao lmaoObject= new lmao();
        System.out.println("enter your name here");
        String name= input.nextLine();
        lmaoObject.smsg(name);
        // TODO code application logic heres
    }
    
}
