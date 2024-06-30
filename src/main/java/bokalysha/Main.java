package bokalysha;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Класс Main представляет собой основной класс программы.
 */
public class Main {
    /**
     * Основной метод программы, который запускает приложение.
     *
     * @param args массив строковых аргументов командной строки.
     */
    public static void main(String[] args) {
        // Создание и инициализация контекста приложения
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Получение экземпляра класса Shop из контекста приложения
        Shop shop = context.getBean("shopBean", Shop.class);
        // Вызов метода shopInclude(), который выполняет функциональность, связанную с магазином
        shop.shopInclude();

        // Закрытие контекста приложения
        context.close();
    }
}
