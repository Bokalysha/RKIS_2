package bokalysha.dependences;

/**
 * Класс Seller представляет объект продавца.
 * Он реализует интерфейс ObjectInformation.
 */
public class Seller implements ObjectInformation {
    private String name;

    /**
     * Метод создает новый объект Seller с заданным именем.
     *
     * @param name имя продавца.
     */
    public Seller(String name) {
        this.name = name;
    }

    /**
     * Метод создает новый объект Seller с именем "NoName".
     */
    public Seller() {
        this.name = "NoName";
    }

    /**
     * Метод устанавливает новое имя продавца.
     *
     * @param name новое имя продавца.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает информацию о продавце в виде строки.
     *
     * @return информация о продавце.
     */
    @Override
    public String getInfo() {
        return "Seller name: " + name;
    }
}
