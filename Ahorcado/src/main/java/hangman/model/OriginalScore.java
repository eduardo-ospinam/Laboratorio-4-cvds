package hangman.model;

public class OriginalScore implements GameScore{
	public OriginalScore(){
	}
	
	/**
     	@pre El score inicia en 100 puntos.
     	@pos El score final se penaliza con 10 puntos con cada letra incorrecta.
		@param correctCount, puntaje correcto que tiene el usuario
		@param  incorrectCount, puntaje incorrecto que tiene el suuario
		@Override
		@throws El score final es menor que 0 
	**/
	public int calculateScore(int correctCount, int incorrectCount) {
		return 100;
	}
	
}
