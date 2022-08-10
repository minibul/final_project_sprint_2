import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        Meat meat = new Meat(5, 100, false);
        Apple redApple = new Apple(10, 50, true,"red");
        Apple greenApple = new Apple(8, 60, true,"green");
        Food[] allFood = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(allFood);

        System.out.println("Общая сумма всех товаров " + cart.getTotalPrice());
        System.out.println("Сумма скидки для всей корзины " + cart.getTotalPriceDiscounted());
        System.out.println("Сумма всех вегетарианских товаров " + cart.getTotalPriceVegetarianFood());

    }


}
