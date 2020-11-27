import Model.Dyrektor;
import Model.Handlowiec;
import View.View;

public class Main {
    public static void main(String[] args){
    View view = new View();
    view.menu();


        Handlowiec handlowiec = new Handlowiec();
        Dyrektor dyrektor = new Dyrektor();
        dyrektor.View();

        //handlowiec.View();

    String ala = "0057";
    String olo = "0056";
    if (ala == olo) {
        System.out.println("TAK");
    }
        else{
            System.out.println("Nie");
        }

    }
}

