package batchGenerator;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Tense {
	
	private static final String[] tenseTime = {"в настоящем", "в прошлом", "в будущем"};
	private static final String[] tenseType = {"Состояние", "Действие", "Процесс", "Результат", "План"};
	private static final Random rnd = new Random();
	
	public String getRandom() {
		String Time = tenseTime[rnd.nextInt(tenseTime.length)];
		String Type = tenseType[rnd.nextInt(tenseType.length)];
		return Type + " " + Time;
	}
}
