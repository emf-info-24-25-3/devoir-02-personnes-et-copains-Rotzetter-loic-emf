package app;

import models.Personne;

public class Application {
        public static void main(String[] args) {
                Personne alex = new Personne("Alex", "Terrieur");
                Personne john = new Personne("John", "Doeuf");
                Personne mac = new Personne("Mac", "Haroni");

                System.out.println(alex);
                System.out.println(john);
                System.out.println(mac);

                alex.ajouterCopain(john);
                alex.ajouterCopain(mac);

                System.out.println(alex);
        }
}
