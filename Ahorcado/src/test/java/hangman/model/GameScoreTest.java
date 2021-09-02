package hangman.model;

import org.junit.Assert;
import org.junit.Test;
import hangman.model.*;

public class GameScoreTest {

	 /**
     * OriginalScore:
      		Clases de equivalencia, 
      			1. No se bonifican las letras correctas.
      			2. Se penaliza con 10 puntos con cada letra incorrecta.
			Condicion frontera puntaje:
				Cuando el puntaje es 0, y se ingresa una letra incorrecta. score < 0 no se deberia de poder.
			
			
		BonusScore:
			Clases de equivalencia:
				1.Se bonifica con 10 puntos cada letra correcta.
				2. Se penaliza con 5 puntos cada letra incorrecta.
			Condicion frontera: 
				Cuando el puntaje es 0, y se ingresa una letra incorrecta. score < 0 no se deberia de poder.
		
		PowerBonusScore
			Clases de equivalencia:
				1.La $i-ésima$ letra correcta se bonifica con $5^i$.
				2.Se penaliza con 8 puntos cada letra incorrecta.
			Condicion frontera: 
				Cuando el puntaje es 0, y se ingresa una letra incorrecta. score < 0 no se deberia de poder.
				Cuando el puntaje es 500, y se ingresa una letra correcta. score > 100 no se deberia de poder.
     */
	
	 private OriginalScore orignalScore = new OriginalScore();
	 private BonusScore bonusScore = new BonusScore();
	 private PowerBonusScore powerBonusScore = new PowerBonusScore();
	 
	@Test
	public void testOriginalScoreNoBonificacionLetraCorrecta() throws exceptionModel { 
		int scoreOriginal = orignalScore.calculateScore(2, 0);
		Assert.assertEquals(100,scoreOriginal);
	}
	

	@Test
	public void testOriginalScorePenalizacionLetraIncorrecta() throws exceptionModel{ 
		int scoreOriginal = orignalScore.calculateScore(0, 2);
		Assert.assertEquals(80,scoreOriginal);
	}
	
	@Test
	public void testOriginalScoreFronteraPuntajeCero() throws exceptionModel{
		int scoreOriginal = orignalScore.calculateScore(0, 100) ;
		Assert.assertEquals(0,scoreOriginal);
	} 
	
	@Test
	public void testBonusScoreBonificacionLetraCorrecta() throws exceptionModel{
		int scoreBonus = bonusScore.calculateScore(4, 0);
		Assert.assertEquals(40,scoreBonus);
	}
	
	@Test
	public void testBonusScorePenalizacionLetraIncorrecta() throws exceptionModel{
		int scoreBonus = bonusScore.calculateScore(0, 3);
		Assert.assertEquals(0,scoreBonus);
	}
	
	@Test
	public void testBonusScoreFronteraPuntajeCero() throws exceptionModel{
		int scoreBonus = bonusScore.calculateScore(0, 100);
		Assert.assertEquals(0,scoreBonus);
	} 
	
	@Test
	public void testPowerBonusScoreBonificacionLetraCorrecta() throws exceptionModel{
		int scoreBonus = powerBonusScore.calculateScore(3, 0);
		Assert.assertEquals(155,scoreBonus);
	}
	
	@Test
	public void testPowerBonusScorePenalizacionLetraIncorrecta() throws exceptionModel{
		int scoreBonus = powerBonusScore.calculateScore(0, 2);
		Assert.assertEquals(0,scoreBonus);
	}
	
	@Test
	public void testPowerBonusScoreFronteraPuntajeCero() throws exceptionModel{
		int scoreBonus = powerBonusScore.calculateScore(0, 100);
		Assert.assertEquals(0,scoreBonus);
	}
	
	@Test
	public void testPowerBonusScoreFronteraPuntajeQuinientos() throws exceptionModel{
		int scoreBonus = powerBonusScore.calculateScore(4, 0);
		Assert.assertEquals(500,scoreBonus);
	}
}
