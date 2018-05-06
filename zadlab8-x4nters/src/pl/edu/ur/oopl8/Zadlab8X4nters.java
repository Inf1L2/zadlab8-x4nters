package pl.edu.ur.oopl8;
import java.util.Scanner;

public class Zadlab8X4nters {
    public static void main(String[] args) {
        int menu = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (menu!=0){
            System.out.println("Lab 8 > Menu >");
            System.out.println(" [ 1 ] Zadanie 1");
            System.out.println(" [ 2 ] Zadanie 2");
            System.out.println(" [ 3 ] Zadanie 3");
            System.out.println(" [ 4 ] Zadanie 4");
            System.out.println(" [ 5 ] Zadanie 5");
            System.out.print("Menu > ");
            menu = scanner.nextInt();
            
            switch(menu){
                case 1: zadanie1(); break;
                case 2: zadanie2(); break;
                case 3: zadanie3(); break;
                case 4: zadanie4(); break;
                case 5: zadanie5(); break;
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
    
    private static void zadanie4(){
        Kwadrat kwadrat1 = new Kwadrat(4);
        System.out.println(kwadrat1.toString());
        
        Prostokat prostokat1 = new Prostokat(2,3);
        System.out.println(prostokat1.toString());
        
        Trojkat trojkat1 = new Trojkat(2,4);
        trojkat1.toString();
        
        Trapez trapez1 = new Trapez(3,4,5);
        trapez1.toString();
        
        Rownoleglobok rownoleglobok1 = new Rownoleglobok(2,4);
        rownoleglobok1.toString();
        
        Romb romb1 = new Romb(2,4);
        romb1.toString();
        
        Kolo kolo1 = new Kolo(3);
        kolo1.toString();
        
        Szescian szescian1 = new Szescian(4);
        szescian1.toString();
        
        Prostopaloscian prostopaloscian1 = new Prostopaloscian(2,3,4);
        prostopaloscian1.toString();
        
        Kula kula1 = new Kula(4);
        kula1.toString();
        
        Walec walec1 = new Walec(3,5);
        walec1.toString();
        
        Stozek stozek1 = new Stozek(3,4,5);
        stozek1.toString();
    }
    
    private static void zadanie5(){
        FiguraGeometryczna[] figuryTab = new FiguraGeometryczna[15];
        
        figuryTab[0] = new Kwadrat(4);
        figuryTab[1] = new Trojkat(2,4);
        figuryTab[2] = new Romb(2,4);
        figuryTab[3] = new Kula(4);
        figuryTab[4] = new Stozek(3,4,5);
        figuryTab[5] = new Szescian(4);
        figuryTab[6] = new Walec(3,5);
        figuryTab[7] = new Prostopaloscian(2,3,4);
        figuryTab[8] = new Kolo(5);
        figuryTab[9] = new Romb(5,7);
        figuryTab[10] = new Kolo(7);
        figuryTab[11] = new Szescian(8);
        figuryTab[12] = new Trojkat(3,6);
        figuryTab[13] = new Kula(10);
        figuryTab[14] = new Kwadrat(7);
        
        int i=0;
        while(i<15){
            System.out.println("Figura " + i+1 + "\n");
            figuryTab[i].toString();
        }
    } 
}
