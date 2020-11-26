package Controller;

import Model.Lista;
import Model.Pracownik;

import java.util.List;



public class AddController {

    public AddController(){};


    public void add_czlowiek(){
        Pracownik pracownik = new Pracownik();
    }


//public void add () {
//
//    Pracownik pracownik = new Pracownik;
////
////        if (pracownik.get_liczba_pracownkow() == 0) {
////        Lista lista = new Lista();
////        lista.add(pracownik);
////        }
////        else {
////            lista.add(pracownik);
////        }
//
//       // lista.set_liczba_praocwnikow(lista.get_liczba_pracownikow+1)
//}
//
//    Pracownik pracownik = new Pracownik();
//    Lista lista = new Lista();
//   // pracownicy.add(pracownik);

//}
    public void dodawanie_pracownika(){
        System.out.println("identyfikator PESEL:");
        System.out.println();
        System.out.println("Imię");
        System.out.println();
        System.out.println("Nazwisko");
        System.out.println();
        System.out.println("Stanowisko");
        System.out.println();
        System.out.println("Wynagrodzenie"); //zl
        System.out.println();
        System.out.println("Telefon służbowy numer");
        System.out.println();
        System.out.println("Dodatek służbowy"); //zl
        System.out.println();
        System.out.println("Karta służbowa numer");
        System.out.println();
        System.out.println("Limit kosztów/miesiąc");
    }



}
