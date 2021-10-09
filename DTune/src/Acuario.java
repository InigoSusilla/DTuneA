import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import acuario.Animal;
import acuario.Pez;

public class Acuario {
	
	private ArrayList<Animales> animales = new ArrayList<Animales>();
	private HashSet<String> sNombres = new HashSet<String>();
	private HashMap<String, ArrayList<Animales>> mTipo = new HashMap<String, ArrayList<Animales>>();
	
	public Acuario(ArrayList<Animales> animales, HashSet<String> sNombres, HashMap<String, ArrayList<Animales>> mTipo) {
		super();
		this.animales = animales;
		this.sNombres = sNombres;
		this.mTipo = mTipo;
		
	}
	public Acuario() {
		super();
		this.mTipo.put("pez", new ArrayList<Animales>());
		this.mTipo.put("mamifero", new ArrayList<Animales>());

	}
	
	public ArrayList<Animales> getAnimales() {
		return animales;
	}
	public void setAnimales(ArrayList<Animales> animales) {
		this.animales = animales;
	}
	public HashSet<String> getsNombres() {
		return sNombres;
	}
	public void setsNombres(HashSet<String> sNombres) {
		this.sNombres = sNombres;
	}
	public HashMap<String, ArrayList<Animales>> getmTipo() {
		return mTipo;
	}
	public void setmTipo(HashMap<String, ArrayList<Animales>> mTipo) {
		this.mTipo = mTipo;
	}
	
	public void anyadirPez(Peces p) {
		animales.add(p);
		sNombres.add(p.getNombre());
		ArrayList<Animales> peces = mTipo.get("pez");
		peces.add(p);
		mTipo.put("pez", peces);
	}
	public void eliminarPez(Peces p) {
		animales.remove(p);
		sNombres.remove(p.getNombre());
		ArrayList<Animales> peces = mTipo.get("pez");
		peces.remove(p);
		mTipo.put("pez",peces);
	}
	@Override
	public String toString() {
		return "Acuario [animales=" + animales + ", sNombres=" + sNombres + "\n, MTIPO=" + mTipo + ", getAnimales()="
				+ getAnimales() + ", getsNombres()=" + getsNombres() + ", getmTipo()=" + getmTipo() + "]";
	}
	
}
