/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import hangman.model.BonusScore;

/**
 *
 * @author 2106913
 */

import hangman.model.Spanish;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
		bind(GameScore.class).to(OriginalScore.class);
		bind(GameScore.class).to(BonusScore.class);
		bind(GameScore.class).to(PowerBonusScore.class);
        bind(Language.class).to(Spanish.class);  
        bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
        bind(HangmanPanel.class).to(HangmanStickmanPanel.class);
    }
}
 
