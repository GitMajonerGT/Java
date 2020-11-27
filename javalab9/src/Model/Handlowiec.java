package Model;

public class Handlowiec extends Pracownik {

    @Override
    public void View() {
        super.View();
        System.out.println("Prowizja");
        System.out.println("Limit prowizji / miesiac");
    }


}
