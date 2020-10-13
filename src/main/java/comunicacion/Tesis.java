package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos= new String[2];
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, 
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	
	public int cantidadArgumentos() {
		return argumentos.length;
	}
	public int palabrasTotales(int palabrasPagina) {
		return this.getPaginas() * palabrasPagina * 5;
	}
	public String interpretacion() {
		return interpretacion;
	}
	public String toString() {
		String r = this.resumen() + "\n";
		r += this.idea  + "\n";
		r += this.cantidadArgumentos()  + "\n";
		r += this.conclusion  + "\n";
		r += this.referencias;
		return r;
	}

}
