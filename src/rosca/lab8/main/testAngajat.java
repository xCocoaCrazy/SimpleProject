package rosca.lab8.main;

import rosca.lab8.classes.Casier;
import rosca.lab8.classes.Manager;

import java.util.ArrayList;

public class testAngajat {
    public static void main(String[] args) {
        ArrayList<Casier> listaCasieri = new ArrayList<>();

        listaCasieri.add(new Casier("Rosca", "Daniel", 120));
        listaCasieri.add(new Casier("Chiron", "Ion", 45));
        listaCasieri.add(new Casier("Ursu", "Ion", 80));

        System.out.println("Lista Casierilor");
        Casier.afisare(listaCasieri);

        ArrayList<Manager> listaManageri = new ArrayList<>();

        listaManageri.add(new Manager("Papuc", "Andrei", 7));
        listaManageri.add(new Manager("Chist", "Ion", 21));
        listaManageri.add(new Manager("Hail", "Andrei", 31));

        System.out.println("\nLista managerilor");
        Manager.afisare(listaManageri);

        System.out.println("\nLista managerilor cu numele Andrei");
        Manager.afisareAndrei(listaManageri);
    }
}
