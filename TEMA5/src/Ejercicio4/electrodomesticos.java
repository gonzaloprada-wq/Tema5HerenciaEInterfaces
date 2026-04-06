	package Ejercicio4;
	
	public class electrodomesticos {
	
		private double precioBase;
	
		private double peso;
	
		private enum Color {
	
			BLANCO, NEGRO, ROJO, AZUL, GRIS
	
		}
	
		private Color color;
	

	
		private String consumoEnergetico;
	
		public electrodomesticos(double precioBase, double peso) {
	
			setPrecioBase(precioBase);
			setPeso(peso);
			this.color = Color.BLANCO;
			this.consumoEnergetico = "F";
	
		}
	
		public electrodomesticos(double precioBase, double peso, String colorElegido, String consumoEnergeticoElegido) {
	
			setPrecioBase(precioBase);
			setPeso(peso);
			setColor(colorElegido);
			this.consumoEnergetico = consumoEnergetico;
	
		}
	
		public double getPrecioBase() {
			return precioBase;
		}
	
		public void setPrecioBase(double precioBase) {
			this.precioBase = precioBase;
		}
	
		
		public double getPeso() {
			return peso;
		}
	
		public void setPeso(double peso) {
			this.peso = peso;
		}
	
		
		public void setColor(String colorRecibido) {
	
			if(comprobarColor(colorRecibido)){
			
			this.color = Color.valueOf(colorRecibido.toUpperCase());
			
			}else{
				
			this.color = Color.BLANCO;
				
			}
				
			
		}
	
		private boolean comprobarColor(String colorRecibido) {
	
			boolean estaDentro = false;
	
			for (Color colorActual : Color.values()) {
	
				if (colorActual.name().equalsIgnoreCase(colorRecibido)) {
	
					estaDentro = true;
	
				}
	
			}
	
			return estaDentro;
		}

		private String getColor() {
			
			return color.name();
			
		}
		
		private void setConsumoEnergetico(String consumoEnergetico){
			
			consumoEnergetico=consumoEnergetico.toUpperCase().trim();

			
			if(consumoEnergetico>="A" && consumoEnergetico<="F"){
				
				this.consumoEnergetico=consumoEnergetico;
				
			}else {
				
				consumoEnergetico="F";
			}
			
		}
		
}
