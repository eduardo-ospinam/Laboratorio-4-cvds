package hangman.model;

public class PowerBonusScore implements GameScore{
	
	private int puntaje;
	
	public PowerBonusScore() {
		this.puntaje = 0;
	}
	
	
	/**
     	@pre El score inicia en 0 puntos.
     	@pos El score final va a ser 500, en caso de sobrepasar este puntaje.
		@param correctCount, puntaje correcto que tiene el usuario
		@param  incorrectCount, puntaje incorrecto que tiene el suuario
		@Override
		@throws El score final es menor que 0;
	**/
	public int calculateScore(int correctCount, int incorrectCount) throws exceptionModel{
		if(correctCount < 0 || incorrectCount < 0) {
			throw new exceptionModel(exceptionModel.INCORRECT_PARAM);
		}
		 
        for(int i=0; i<correctCount;i++){
        	this.puntaje += Math.pow(5,i+1);
        }
		this.puntaje -= (incorrectCount*8);
		
		if(this.puntaje < 0) {
			this.puntaje = 0;
		}
		else if(this.puntaje > 500) {
			this.puntaje = 500;
		}
		return puntaje;
	}

}
