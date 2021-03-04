package rosca.lab8.classes;

//Imports
import rosca.lab8.interfaces.Angajat;
import java.util.ArrayList;

public class Manager implements Angajat {
    //Fields
    private String numeManager;
    private String prenumeManager;
    private int zileLucrate;
    private final int nOre = 10;

    //Constructors
    public Manager() {
        numeManager = null;
        prenumeManager = null;
        zileLucrate = 0;
    }

    public Manager(String numeManager, String prenumeManager, int zileLucrate) {
        this.numeManager = numeManager;
        this.prenumeManager = prenumeManager;
        this.zileLucrate = zileLucrate;
    }

    //Getters
    public String getPrenumeManager() {
        return prenumeManager;
    }

    //Salariul
    @Override
    public double getSalar() {
        return zileLucrate * tarifOrar * nOre;
    }

    //Afisarea datelor
    public static void afisare(ArrayList<Manager> list) {
        for(Manager i : list) {
            System.out.println(i.toString());
        }
    }

    //Afisarea managerilor cu numele Andrei
    public static void afisareAndrei(ArrayList<Manager> list) {
        for(Manager i : list) {
            if(i.getPrenumeManager().equals("Andrei")) {
                System.out.println(i.toString());
            }
        }
    }

    //toString cu StringBuilder pentru a nu avea mai multe obiecte de String
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Casier{");
        sb.append(numeManager); sb.append(" ");
        sb.append(prenumeManager); sb.append(" ");
        sb.append(zileLucrate); sb.append(" ");
        sb.append(getSalar()); sb.append("}");

        return sb.toString();
    }
}
