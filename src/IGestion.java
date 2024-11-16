public interface IGestion<T> {
	void ajouterEmploye(T t);
	boolean rechercherEmploye(String nom);
	boolean rechercherEmploye(T t);
	void supprimerEmploye(T t);
	void displayEmploye();
	void trierEmployeParId(); // Utilisation de Comparable
	void trierEmployeParNomDépartementEtGrade(); // Utilisation de Comparator
}
