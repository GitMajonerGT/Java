package View;

public class View {

    public View(){};

    public void controlls(int aktualna, int maksymalna){
        System.out.println("[Enter] - nastepny");
        System.out.println("[Q] - powrot");
    }
    public void add_controlls(){
        System.out.println("[Enter] - Zapsiz");
        System.out.println("[Q] - porzuc");
    }

    //numer karty na ktorej jestes przegladajac pracownikow
    public void pozycja(int aktualna, int maksymalna){
        System.out.println("Pozycja " + aktualna + " na " + maksymalna);
    }

    public void menu(){

        System.out.println("1.Lista pracownikow");
        System.out.println("1.Dodaj pracownika");
        System.out.println("1.Usun pracownika");
        System.out.println("5.Kopia zapasowa"); // co to?

    }

    public void lista_pracownikow(){
        System.out.println("identyfikator PESEL:");
        System.out.println("Imię");
        System.out.println("Nazwisko");
        System.out.println("Stanowisko");
        System.out.println("Wynagrodzenie"); //zl
        System.out.println("Telefon służbowy numer");
        System.out.println("Dodatek służbowy"); //zl
        System.out.println("Karta służbowa numer");
        System.out.println("Limit kosztów/miesiąc");
    }




}

