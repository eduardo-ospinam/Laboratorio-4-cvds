package hangman.model;

public class BonusScore implements GameScore{
	
	private int puntaje;
	
	public BonusScore() {
		this.puntaje = 0;
	}
	
	/**
     	@pre El score inicia en 0 puntos.
     	@pos El score final se bonifica con 10 puntos cada letra correcta, y se penaliza con 5 puntos cada letra incorrecta.
		@param correctCount, puntaje correcto que tiene el usuario
		@param  incorrectCount, puntaje incorrecto que tiene el suuario
		@Override
		@throws El score final es menor que 0;
	**/
	public int calculateScore(int correctCount, int incorrectCount) throws exceptionModel{
		if(correctCount < 0 || incorrectCount < 0) {
			throw new exceptionModel(exceptionModel.INCORRECT_PARAM);
		}
		
		this.puntaje += (correctCount*10); 
		this.puntaje -= (incorrectCount*5);
		
		if(this.puntaje < 0) {
			this.puntaje = 0;
		}
		return puntaje;
	}

}
