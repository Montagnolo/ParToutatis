package personnages;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Gaulois {
	private String nom;
	private int force;
	private int effectPotion = 1;

	public Gaulois(String nom, int foce) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) { 
		System.out.println(prendreParole() + "« " + texte + "»"); 
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effectPotion=" + effectPotion + "]";
	}
	public static void main(String[] args) {
//		TODO créer un main permettant de tester la classe Gaulois
		public Gaulois(String nom, int force) {
			this.nom =nom = Astérix;
			this.force = 8;
			System.out.println(asterix);
		
		}
		}
}

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(string texte) {
		System.out.println(prendreParole () + "<<" + texte + ">>");
	}

	public String prendreParole() {
		return "Le romain " + nom + ":";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		}else {
				parler("J'abandonne...");
		}	
	}
}

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis me driud " + nom + " et ma potion peut aller d'une force " + effet PotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(string texte) {
		System.out.println(prendreParole () + "<< " + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
}

public class Village {
	private String nom;
	
	public Village(String nom) {
		this.nom =nom;
	}

	public String getNom() {
		return nom;
	}	
}

public class Chef {
	private String nom;
	private int force;
	private Village village;
	
	public Chef(String nom, int force, Village village) {
		this.nom = nom;
		this.force = force;
		this.village = village;
	}
	
	public String getNom () {
		return nom;	
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole () + "<< " + texte + ">>");
	}

	public String prendreParole() {
		return "Le chef " + nom + " du village " + village.getNom() + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	
}