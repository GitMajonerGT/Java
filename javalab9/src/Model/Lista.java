package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Lista {

    boolean exist = false;
    static ArrayList<Pracownik> pracownicy;

    public void add (){
        Pracownik pracownik = new Pracownik();
        //Pracownik.initlialise();
        //jezeli lista nie istnieje
        if (!exist){
            //SortedMap<int,Pracownik> sortedMap = new TreeMap(pracownik.getId(), pracownik);
            pracownicy = new ArrayList<Pracownik>();
            pracownicy.add(pracownik);
            exist = true;
            return;
        }
        else {
            pracownicy.add(pracownik);
        }

    }

//    private List<Pracownik>lista;
//
//    public void add(Pracownik pracownik){
//        lista.add(pracownik);
//    }
//    Pracownik get(Pracownik pracownik){
//        for(lista:pracownik){
//            if (lista.get(0) == pracownik)
//                return pracownik;
//            else continue;
//        }
//
//    }

}
