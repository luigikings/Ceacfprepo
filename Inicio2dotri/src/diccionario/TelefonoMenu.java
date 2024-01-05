package diccionario;

public enum TelefonoMenu {
	AÑADIR("1"), ELIMINAR("2"), BUSCAR("3"), MOSTRAR("4"), SALIR("5");
	
	String valor;
	
	
	//contructor
	TelefonoMenu(String valor){
		this.valor=valor;
	}
	
	//get
	public String getValor() {
		return this.valor;
	}
}