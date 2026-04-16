package EjComparador4;

import java.util.Comparator;

public class Ficha implements Comparable<Ficha>{

	private int id;
	
	private String name;

	public Ficha(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}

	public int compareTo(Ficha otra) {
		
		return getId()-otra.getId();
	}

	@Override
	public String toString() {
		return "Ficha [id=" + id + ", name=" + name + "]\n";
	}

	
	
	
}
