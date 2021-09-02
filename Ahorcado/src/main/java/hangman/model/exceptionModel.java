package hangman.model;

public class exceptionModel extends Exception{
	
	
	//Excepciones generales
	public static final String INCORRECT_PARAM = "No puede ingresar valores negativos en los parametros.";
	
    public exceptionModel(String msg) {
        super(msg); 
    }
}
