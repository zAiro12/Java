import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MapStringInt {

  public class Node {
    int v;
    String k;
    
    Node(String k, int v) {
      this.k = k;
      this.v = v;
    }
  }
  LinkedList<Node> map;

  //EFFECTS: Costruttore vuoto: crea solamente la LinkedList
  public MapStringInt() {
    map = new LinkedList<Node>();
  }

  //REQUIRES: k non deve già essere una chiave della mappa
  //MODIFIES: la mappa conterrà un nuovo elemento; System.out per avvisare l'utente che la chiave era già presente
  //EFFECTS: Inserisce un elemento nella mappa di chiave k e valore v
  public void put(String k, int v) {
    map.add(new Node(k, v));
    if (!repOk()) {
      for (int i = 0; i < map.size(); i++) {
        if (map.get(i).k.equals(k))
          map.remove(i);
      }
      System.out.println(k + " era già presente: sostituito con il nuovo valore");
    }
  }

  //EFFECTS: restituisce l'elemento v associato a k
  public int get(String k) {
    for(int i=0; i<map.size(); i++) {
      Node n = map.get(i);
      if(n.k == k) {
        return n.v;
      }
    }
    throw new RuntimeException("Elemento non presente");
  }

  //MODIFIES: rimuove l'elemento dalla mappa
  //EFFECTS: restituisce l'elemento v associato a k e lo cancella dalla mappa
  public int remove(String k) {
    for(int i=0; i<map.size(); i++) {
      Node n = map.get(i);
      if(n.k.equals(k)) {
        int app = n.v;
        map.remove(i);
        return app;
      }
    }
    System.out.println("Elemento non presente");
    return 0;+ 
  }

  //INVARIANTE DI RAPPRESENTAZIONE
  //EFFECTS: restituisce true se la mappa rispetta il vincolo di non avere chiavi duplicate
  private boolean repOk() {
    ArrayList<String> vett = new ArrayList<String>();
    for (int i=0; i<map.size(); i++) {
      if (vett.contains(map.get(i).k)) 
        return false;
      else
        vett.add(map.get(i).k);
    }
    return true;
  }

  //EFFECTS: restituisce una rappresentazione human-readable della classe, implementado quindi la funzione di astrazione
  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    for (Node e : map) {
      s.append(e.k + " -> " + Integer.toString(e.v) + "\n");
    }
    return s.toString();
  }

  @Override
  public boolean equals(Object m) {
    if(!(m instanceof MapStringInt))
      return false;
    MapStringInt other = (MapStringInt)m;
    for (int i=0; i<map.size(); i++) {
      if (other.map.contains(map.get(i))) {
        int v = other.remove(map.get(i).k);
        if (v != get(map.get(i).k))
          return false;
      } 
      else 
        return false;
    }
    if (other.map.isEmpty())
      return true;
    else 
      return false;
  }

  @Override
  public int hashCode() {
    int result = 0;
    for (int i=0; i<map.size(); i++) {
      Node n = map.get(i);
      result += 31 * n.k.hashCode() + 17 * Integer.hashCode(n.v);
    }
    return result;
  }

  public static void main(String[] args) {
    MapStringInt mappa = new MapStringInt();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    while(!s.equals("-1")) {
      String[] sl = s.split(" ");
      if (sl[0].equals("+"))
        mappa.put(sl[1], Integer.parseInt(sl[2]));
      else if (sl[0].equals("-"))
        mappa.remove(sl[1]);
      else
        throw new RuntimeException("Usare + per inserire, - per togliere!");
      s = sc.nextLine();
    }
    sc.close();
    System.out.println();
    System.out.println(mappa.toString());
  }
}
