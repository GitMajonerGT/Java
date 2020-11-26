package Model;

public class Pracownik {

    private String Imie;
    private String Nazwisko;
    private String Pesel;
    private String Profesja;
    private int liczba_pracownikow;

    public String getImie() {
        return Imie;
    }
    public String getNazwisko() {
        return Nazwisko;
    }
    public String getPesel() {
        return Pesel;
    }
    public void setImie(String imie) {
        Imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }
    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    public void View(){
        System.out.println("przed dziedziczeniem");
    }



}
