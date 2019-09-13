
public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point alpha = new Point();
		Point beta = new Point(100, 200);
		
		alpha.initialise(3,5);
		beta.initialise(0, 8);
		alpha.affiche();
		beta.affiche();
		alpha.déplace(2, 0);
		alpha.affiche();
		beta.affiche();
	}

}
