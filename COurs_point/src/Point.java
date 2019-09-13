
public class Point {
  private int x1;//abciss - x
  private int y1;//ordonnée - y
  private String nom;
  
  
  public Point() {
	  x=10;
	  y=10;
  }
  /*public Point(int abs, int ord, String nom) {
	  x=abs;
	  y=ord;
	  setNom=(nom);
  }*/
  
  public void initialise (int abs, int ord) {
	x1 = abs;
	y1 = ord;
  
}
  /*public void setNom(x1, y1) {
	  x1 = alpha;
	  y1 = beta;
  }*/
  public void déplace(int dx, int dy) {
	 x1 += dx;
	 y1 += dy;		  
  }
  public void affiche ()
  { System.out.println ("Je suis un point de coordonnees " + x1 + " " + y1) ;
  }
  private int x ; // abscisse
  private int y ; // ordonnee
}
