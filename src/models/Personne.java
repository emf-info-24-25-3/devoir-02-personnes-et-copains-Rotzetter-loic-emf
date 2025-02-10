package models;

import java.util.ArrayList;
import java.util.List;

public class Personne {
        private final String prenom;
        private final String nom;
        private static final int MAX_COPAINS = 10;
        private final List<Personne> copains;

        public Personne(String prenom, String nom) {
                this.prenom = prenom;
                this.nom = nom.toUpperCase();
                this.copains = new ArrayList<>();
        }

        public String getPrenom() {
                return prenom;
        }

        public String getNom() {
                return nom;
        }

        public boolean ajouterCopain(Personne copain) {
                if (copains.size() < MAX_COPAINS && !copains.contains(copain)) {
                        copains.add(copain);
                        return true;
                }
                return false;
        }

        public boolean supprimerCopain(Personne copain) {
                return copains.remove(copain); 
        }

        @Override
        public String toString() {
                StringBuilder description = new StringBuilder(prenom + " " + nom + " et ses copains ");

                if (copains.isEmpty()) {
                        description.append("(aucun copain)");
                } else {
                        description.append("(");
                        for (int i = 0; i < copains.size(); i++) {
                                description.append(copains.get(i).getPrenom()).append(" ")
                                                .append(copains.get(i).getNom());
                                if (i < copains.size() - 1) {
                                        description.append(", ");
                                }
                        }
                        description.append(")");
                }
                return description.toString();
        }
}
