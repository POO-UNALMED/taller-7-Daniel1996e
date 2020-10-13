package comunicacion;


public class Alfabeto extends Pictograma{
	private String[] letras= new String[26];
	private String interpretacion;
	
	public Alfabeto(String origen , String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	

	public int cantidadLetras() {
		return letras.length;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String acc = "";
		for (int i = 0; i < 25; i ++) {
			acc = acc + this.letras[i] + ", ";
		}
		acc = acc + this.letras[25];
		return acc;
	}

}

