package bokalysha;

import bokalysha.dependences.ObjectInformation;

import java.beans.ConstructorProperties;
/**
 * Класс Shop представляет магазин и содержит информацию о продавце, кассовом аппарате и стеллаже с товарами.
 */
public class Shop {
    private final ObjectInformation cashRegister;
    private final ObjectInformation shelf;
    private final ObjectInformation seller;

    /**
     * Конструктор класса Shop.
     *
     * @param seller информация о продавце.
     * @param cashRegister информация о кассовом аппарате.
     * @param shelf информация о полке с товарами.
     */
    @ConstructorProperties({"seller", "cashRegister", "shelf"})
    public Shop(ObjectInformation seller, ObjectInformation cashRegister, ObjectInformation shelf) {
        this.cashRegister = cashRegister;
        this.shelf = shelf;
        this.seller = seller;
    }

    /**
     * Метод shopInclude() выводит информацию о содержимом магазина, включая информацию о продавце,
     * кассовом аппарате и товарах на полке.
     */
    public void shopInclude() {
        System.out.println("Shop contain:");
        System.out.println(seller.getInfo());
        System.out.println(cashRegister.getInfo());
        System.out.println(shelf.getInfo());
    }
}
