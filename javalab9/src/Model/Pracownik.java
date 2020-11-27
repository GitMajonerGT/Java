package Model;

public class Pracownik {

    private String Pesel;
    private String Imie;
    private String Nazwisko;
    private String Stanowisko;
    private int liczba_pracownikow;
    private int id = 0;

    public int getId(){return id;}
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

        System.out.println("Pesel");
        System.out.println("Imie");
        System.out.println("Nawisko");
        System.out.println("Stanowisko:");
        System.out.println("Wynagrodzenie:");

    }



}
