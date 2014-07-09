package batchGenerator;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Object {

	private String[][] objects = {{"Я"},{"Ты"},{"Он","Твой брат","Её племянник","Мой босс","Высокий мужчина","Толстый мужчина одетый в темный костюм","Мой сосед"},{"Она","Моя сестра","Его племянница","Красивая женщина","Уродливая девочка"},{"Оно","Собака","Новый проект","Маленькая голубая машина","Летающая тарелка","Последнее собрание", "Запланированная поездка"},{"Мы","Наша семья"},{"Они","Мои родители","Коллеги","Наши партнеры","Мальчик и девочка"}};
	private static final Random rnd = new Random();
	
	public String getRandom() {
		String[] objFace = objects[rnd.nextInt(objects.length)];
		String object = objFace[rnd.nextInt(objFace.length)];
		return object;
	}

}
