package batchGenerator;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sentence {

	private static final String[] sentenceType = {"+", "-", "?"};
	private static final String[] questionWords = {"","Почему","Когда","Где","Кто","Как много","Как долго"};
	@Autowired
	private Tense tense;
	@Autowired
	private Object obj;
	private static final Random rnd = new Random();

	public String getRandom() {
		String type = sentenceType[rnd.nextInt(sentenceType.length)];
		String question = "";
		String rndTense = tense.getRandom();
		// Для вопросительных добавляем уточняющие слова вопроса
		if (type == "?") {
			question = questionWords[rnd.nextInt(questionWords.length)];
			// Костыль - не все вопросы уместны для состояния
			if (rndTense == "Состояние в настоящем") {
				if (question != "Почему" && question != "Где")	question = "Почему";
			} else
				if (rndTense.startsWith("Состояние")) {
					if (question == "Кто" || question == "Как много")	question = "Почему";
				}
			// Костыль - не все вопросы уместны для состояния
			if (rndTense.startsWith("Результат")) {
				if (question != "Почему" && question != "Как много" && question != "Кто")	question = "Почему";
			} 
		}
		return  question + ((question == "") ? "" : " ") + obj.getRandom() + " " + type + " <" + rndTense + ">";
		
	}
}
