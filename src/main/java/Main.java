import com.kodilla.good.patterns.challenges.movie_store.MovieStore;

import com.kodilla.good.patterns.challenges.order_service.ProductOrderService;
import com.kodilla.good.patterns.challenges.order_service.data.Customer;
import com.kodilla.good.patterns.challenges.order_service.data.Product;
import com.kodilla.good.patterns.challenges.order_service.services.MailService;
import com.kodilla.good.patterns.challenges.order_service.services.Repository;

import com.kodilla.good.patterns.challenges.food2door.FoodOrderService;
import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.Man;
import com.kodilla.good.patterns.challenges.food2door.services.EmailService;
import com.kodilla.good.patterns.challenges.food2door.supplaliers.ExtraFoodShop;

public class Main {
    public static void main(String[] args) {

        // 13.1. Idea czystego kodu
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getAllTranslations());
        System.out.println("XXXXXXXXXXXXXXXXXXX");


        // 13.2. SOLID + DRY
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new Repository());
        productOrderService.prepareRepository();

        Customer customer1 = new Customer("Paweł Wierzgała","Słoneczna 3", "niedomyty16@buziaczek.pl");
        Product product1 = new Product("S10");

        productOrderService.orderProcess(product1, customer1, 1);
        System.out.println("XXXXXXXXXXXXXXXXXXX");


        // 13.4 Przełożenie teorii na praktykę cz. 1
        FoodOrderService foodOrderService = new FoodOrderService(new EmailService(), new ExtraFoodShop());
        foodOrderService.prepareMenu();

        Food food = new Food("Sernik");
        Man hungryMan = new Man("Paweł Wierzgała","Słoneczna 3", "niedomyty16@buziaczek.pl");
        Man moreHungryMan = new Man("Piotr Wąsik","Rzeszow", "umyty2@ornitolog.pl");

        foodOrderService.orderProcess(food, hungryMan, 23);
        System.out.println("=====");
        foodOrderService.orderProcess(food, moreHungryMan, 213);

    }
}