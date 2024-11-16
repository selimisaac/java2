public class Main {
	public static void main(String[] args) {
		SocieteArrayList societe = new SocieteArrayList();

		Employe e1 = new Employe(1, "Doe", "John", "Informatique", 2);
		Employe e2 = new Employe(2, "Smith", "Jane", "RH", 3);
		Employe e3 = new Employe(3, "Brown", "Alice", "Informatique", 1);


		societe.ajouterEmploye(e1);
		societe.ajouterEmploye(e2);
		societe.ajouterEmploye(e3);


		System.out.println("Liste des employés :");
		societe.displayEmploye();


		societe.trierEmployeParId();
		System.out.println("\nListe triée par ID :");
		societe.displayEmploye();


		societe.trierEmployeParNomDépartementEtGrade();
		System.out.println("\nListe triée par Nom Département et Grade :");
		societe.displayEmploye();


		System.out.println("\nRechercher 'Smith' : " + societe.rechercherEmploye("Smith"));


		societe.supprimerEmploye(e2);
		System.out.println("\nListe après suppression de 'Smith' :");
		societe.displayEmploye();
	}
}
