public class Rational {
  private int num;
  private int den;

  public Rational(int n, int d) {
    num = n;
    den = d;
    if (!repOk()) {
      throw new DenominatoreZeroException("Il denominatore non può essere zero!");
    }
  }

  //REQUIRES: r1 e r2 diversi da 0
  //EFFECTS: restituisce il massimo comun divisore tra due interi
  private static int MCD(int r1, int r2) {
    while(r2 != 0) {
      int x = r2;
      r2 = r1 % r2;
      r1 = x;
    }
    return r1;
  }

  //EFFECTS: restituisce il mcm tra i denominatori di due numeri razionali
  public static int mcm(Rational r1, Rational r2) {
    return (r1.den * r2.den) / MCD(r1.den, r2.den);
  }

  //EFFECTS: restituisce la somma tra due numeri razionali
  public Rational sum(Rational other) {
    int mcm = mcm(this, other);
    int n = mcm / den * num + mcm / other.den * other.num;
    return new Rational(n, mcm);
  }

  //EFFECTS: restituisce la differenza tra due numeri razionali
  public Rational diff(Rational other) {
    Rational o = new Rational(-other.num, other.den);
    return sum(o);
  }

  //EFFECTS: restituisce il prodotto tra due numeri razionali
  public Rational prod(Rational other) {
    return new Rational(num * other.num, den * other.den);
  }

  //EFFECTS: restituisce la divisione tra due numeri razionali
  public Rational div(Rational other) {
    return new Rational(num * other.den, den * other.num);
  }

  //EFFECTS: restituisce il numero in forma stampabile (funzione d'astrazione)
  @Override
  public String toString() {
    return "(" + num + "/" + den + ")";
  }

  //EFFECTS: restituisce true se due numeri razionali sono uguali (a meno di una costante moltiplicativa)
  @Override
  public boolean equals(Object o) {
    if(!(o instanceof Rational)) 
      return false;
    Rational other = (Rational) o;
    int mcm = mcm(this, other);
    if (mcm / den * num == mcm / other.den * other.num)
      return true;
    return false;
  }

  //EFFECTS: restituisce true se il numero rispetta l'invariante di rappresentazione, 
  //         cioè denominatore diverso da zero
  private boolean repOk() {
    if (den != 0)
      return true;
    else
      return false;
  }

  //EFFECTS: restituisce l'hashcode
  /*@Override
  public int hashCode() {
    return 
  }*/
}
