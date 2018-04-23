/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl8;
import java.util.Scanner;
/**
 *
 * @author x4nte
 */
public class Zadlab8X4nters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (menu!=0){
            System.out.println("Lab 8 > Menu >");
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 3 ] Zadania 3");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
                case 3: zadanie3(); break;
                case 0: break;
            }
        }
    }
    
    private static void zadanie1(){
        
    }
    
    private static void zadanie2(){
        Ksiazka ksiazka1 = new Ksiazka(20.45,"Nazwa","Opis","Autor","Tytul");
        ksiazka1.buy();
        ksiazka1.showInfo();
        
        Dzem dzem1 = new Dzem(30.23,"Nazwa dzemu","Opis dzemu");
        dzem1.buy();
        dzem1.showInfo();
        
        Polopiryna polopiryna1 = new Polopiryna(10.23,"Nazwa polopiryny","Opis polopiryny");
        polopiryna1.buy();
        polopiryna1.showInfo();
        
        Dlugopis dlugopis1 = new Dlugopis(24.34,"Nazwa dlugopisu","Opis dlugopisu");
        dlugopis1.buy();
        dlugopis1.showInfo();
        
        Czekolada czekolada1 = new Czekolada(2.45,"Nazwa czekolady","Opis czekolady");
        czekolada1.buy();
        czekolada1.showInfo();
    }
    
    private static void zadanie3(){
       Product[] productTab1 = new Product[10];
       
       productTab1[0] = new Ksiazka(20.45,"Nazwa","Opis","Autor","Tytul");
       productTab1[1] = new Czekolada(2.45,"Nazwa czekolady","Opis czekolady");
       productTab1[2] = new Ksiazka(20.45,"Nazwa","Opis","Autor","Tytul");
       productTab1[3] = new Dlugopis(24.34,"Nazwa dlugopisu","Opis dlugopisu");
       productTab1[4] = new Dzem(30.23,"Nazwa dzemu","Opis dzemu");
       productTab1[5] = new Polopiryna(10.23,"Nazwa polopiryny","Opis polopiryny");
       productTab1[6] = new Dzem(30.23,"Nazwa dzemu","Opis dzemu");
       productTab1[7] = new Czekolada(2.45,"Nazwa czekolady","Opis czekolady");
       productTab1[8] = new Dlugopis(24.34,"Nazwa dlugopisu","Opis dlugopisu");
       productTab1[9] = new Tractor(23.34,"Nazwa traktora","Opis traktora");
       
       for (int i=0; i<10; i++){
           productTab1[i].buy();
           productTab1[i].showInfo();
       }
    }
}
