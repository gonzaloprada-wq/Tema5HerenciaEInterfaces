	package Ejercico5;
	
	import java.util.ArrayList;
	
	public class gestion {
	
		
		private static ArrayList<Poligono> listaPoligonos = new 	ArrayList<>();
		
	
		public gestion() {

		    }
	        
	    
		public ArrayList<Poligono> getListaPoligonos() {
			return listaPoligonos;
		}


		public void setListaPoligonos(ArrayList<Poligono> listaPoligonos) {
			this.listaPoligonos = listaPoligonos;
		}
		
		
		public void añadirPoligonoListadO(Poligono nuevoPoligono){
			
		getListaPoligonos().add(nuevoPoligono);			
			
		}
		
		public void imprimirPoligonos(){
			
			if(getListaPoligonos().size()==0){
				
				System.out.println("No hay valores :(");
				
			}
			
			for(Poligono actual : getListaPoligonos()){
				
				System.out.println(actual.toString());
				
			}
			
		}
				
		
	}

	