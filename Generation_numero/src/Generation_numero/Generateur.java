package Generation_numero;
import java.util.*;

public class Generateur {
	private ArrayList<Integer> num;
	private Generation_numero n;
	private int size;
	private int nb_numero;
	
	public Generateur() {
		this.n = new Generation_numero();
		this.num = new ArrayList<Integer>();
	}
	
	public void genere(int size, int nb_numero) {
		Integer temp;
		for (int i = 0; i < nb_numero;i++) {
			temp = Integer.valueOf(n.generateur(size));
			for (int j =0; j < num.size();j++) {
				while(temp == num.get(j)) {
					j = 0;
					temp = Integer.valueOf(n.generateur(size));
				}
			}
			num.add(temp);
		}
	}
	
	public void afficher_list() {
		for (int i = 0; i < num.size();i++) {
			System.out.println(num.get(i));
		}
	}
	
	public ArrayList<Integer> getNum() {
		return num;
	}

	public static void main(String[] srg) {
		Generateur g = new Generateur();
		g.genere(9, 5);
		g.afficher_list();
	}
}
