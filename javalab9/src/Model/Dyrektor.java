package Model;

public class Dyrektor extends Pracownik {

   public Dyrektor(){};

    @Override
    public void View(){
        super.View();
        System.out.println("Dodaatek sluzbowy");
        System.out.println("Karta sluzbowa numer");
        System.out.println("Limit kosztow / miesiac ");
    }

}
