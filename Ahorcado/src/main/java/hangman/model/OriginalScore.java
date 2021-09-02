package hangman.model;

public class OriginalScore implements GameScore{
	
	private int puntaje;
	
	public OriginalScore(){
		this.puntaje = 100;
	}
	
	/**
     	@pre El score inicia en 100 puntos.
     	@pos El score final se penaliza con 10 puntos con cada letra incorrecta.
		@param correctCount, puntaje correcto que tiene el usuario
		@param  incorrectCount, puntaje incorrecto que tiene el suuario
		@Override
		@throws El score final es menor que 0 
	**/
	public int calculateScore(int correctCount, int incorrectCount) throws exceptionModel {
		if(correctCount < 0 || incorrectCount < 0) {
			throw new exceptionModel(exceptionModel.INCORRECT_PARAM);
		}
		 
		this.puntaje -= (incorrectCount*10); 
		
		if(this.puntaje < 0) {
			this.puntaje = 0;
		}
		return puntaje;
	}
	
}
