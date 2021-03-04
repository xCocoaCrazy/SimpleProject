package rosca.lab8.classes;

import rosca.lab8.interfaces.Angajat;
import java.util.ArrayList;

public class Casier implements Angajat {
    //Fields
    private String numeSalariat;
    private String prenumeAngajat;
    private int nOre;

    //Constructors
    public Casier() {
        numeSalariat = null;
        prenumeAngajat = null;
        nOre = 0;
    }

    public Casier(String numeSalariat, String prenumeAngajat, int nOre) {
        this.numeSalariat = numeSalariat;
        this.prenumeAngajat = prenumeAngajat;
        this.nOre = nOre;
    }

    //Salariul
    @Override
    public double getSalar() {
        return tarifOrar * nOre;
    }

    //Afisarea
    public static void afisare(ArrayList<Casier> list) {
        for(Casier i : list) {
            System.out.println(i.toString());
        }
    }

    //toString folosing StringBuilder pentru a nu crea mai multe obiecte de tip String
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Casier{");
        sb.append(numeSalariat); sb.append(" ");
        sb.append(prenumeAngajat); sb.append(" ");
        sb.append(nOre); sb.append(" ");
        sb.append(getSalar()); sb.append("}");

        return sb.toString();
    }
}
