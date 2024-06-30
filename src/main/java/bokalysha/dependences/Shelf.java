package bokalysha.dependences;

/**
 * Класс Shelf представляет объект стеллажа, на котором хранятся товары.
 * Он реализует интерфейс ObjectInformation.
 */
public class Shelf implements ObjectInformation {
    private String product;

    /**
     * Метод создает новый объект Shelf с указанным товаром.
     *
     * @param product начальный товар на стеллаже.
     */
    public Shelf(String product) {
        this.product = product;
    }

    /**
     * Метод создает новый объект Shelf с начальным товаром.
     */
    public Shelf() {
        this.product = "default";
    }

    /**
     * Метод устанавливает товар на стеллаже.
     *
     * @param product новый товар на стеллаже.
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Метод возвращает строковое представление товаров на стеллаже.
     *
     * @return строковое представление товаров на стеллаже.
     */
    @Override
    public String getInfo() {
        return "Shelf contain: " + product;
    }
}
