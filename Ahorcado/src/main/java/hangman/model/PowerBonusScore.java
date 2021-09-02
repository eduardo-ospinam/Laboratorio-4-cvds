package hangman.model;

public class PowerBonusScore implements GameScore{
	
	public PowerBonusScore() {
		
	}
	
	
	/**
     	@pre El score inicia en 0 puntos.
     	@pos El score final va a ser 500, en caso de sobrepasar este puntaje.
		@param correctCount, puntaje correcto que tiene el usuario
		@param  incorrectCount, puntaje incorrecto que tiene el suuario
		@Override
		@throws El score final es menor que 0;
	**/
	public int calculateScore(int correctCount, int incorrectCount) {
		return 0;
	}

}
