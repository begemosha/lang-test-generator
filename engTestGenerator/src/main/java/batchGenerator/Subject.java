package batchGenerator;

import java.util.Random;

// Правила http://www.gramma.ru/RUS/?id=4.32 http://speak-russian.cie.ru/time_new/rus/grammar/

public class Subject {
	private String[] possibleSubjects = {"Делать", "Просить", "Давать", "Знать"};
	private static final Random RND = new Random();
	public String getRandom() {
		 String mainForm = possibleSubjects[RND.nextInt(possibleSubjects.length)];
		 // Пока только первое спряжение
		 String endForm = "";
		 if (mainForm.endsWith("ть")) {
			 endForm = mainForm.substring(0, mainForm.length()-2);
			 endForm = endForm + "ю"; // после согласных нужно у
		 }
		 //else лажа
		 
		 return endForm;
	}	
}
