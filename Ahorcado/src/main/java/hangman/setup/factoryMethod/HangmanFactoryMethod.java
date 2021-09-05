package hangman.setup.factoryMethod;


import hangman.model.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.HangmanPanel;


abstract public class HangmanFactoryMethod{
	    

	public abstract HangmanPanel createHangmanPanel();

	public abstract HangmanDictionary createDictionary();

	public abstract Language createLanguage();
	
}
