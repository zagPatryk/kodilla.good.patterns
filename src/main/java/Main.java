//import com.kodilla.good.patterns.challenges.flight.data.Airport;
//import com.kodilla.good.patterns.challenges.flight.services.FlightSearcher;
//import com.kodilla.good.patterns.challenges.food2door.data.FoodCustomer;
//import com.kodilla.good.patterns.challenges.movie_store.MovieStore;
//
//import com.kodilla.good.patterns.challenges.order_service.ProductOrderService;
//import com.kodilla.good.patterns.challenges.order_service.data.Customer;
//import com.kodilla.good.patterns.challenges.order_service.data.Product;
//import com.kodilla.good.patterns.challenges.order_service.services.MailService;
//import com.kodilla.good.patterns.challenges.order_service.services.Repository;
//
//import com.kodilla.good.patterns.challenges.food2door.FoodOrderService;
//import com.kodilla.good.patterns.challenges.food2door.data.Food;
//import com.kodilla.good.patterns.challenges.food2door.services.EmailService;
//import com.kodilla.good.patterns.challenges.food2door.supplaliers.ExtraFoodShop;
//
//public class Main {
//    public static void main(String[] args) {
//
//        // 13.1. Idea czystego kodu
//
//        System.out.println("XXXXXXXXXXXXXXXXXXX");
//
//        // 13.2. SOLID + DRY
//
//
//        System.out.println("XXXXXXXXXXXXXXXXXXX");
//
//
//        // 13.4 Przełożenie teorii na praktykę cz. 1
//
//
//        System.out.println("XXXXXXXXXXXXXXXXXXX");
//
//        // 13.5 Przełożenie teorii na praktykę cz. 2
//        Airport warsaw = new Airport("Warsaw");
//        Airport london = new Airport("London");
//        Airport berlin = new Airport("Berlin");
//        Airport tokyo = new Airport("Tokyo");
//
//        FlightSearcher flightSearcher = new FlightSearcher();
//        flightSearcher.setAirportsDestinations();
//        boolean result = false;
//
//        result = flightSearcher.flightSearcher(warsaw, berlin);
//
//        if (result) {
//            System.out.println("Dolecisz wykonując " + flightSearcher.getFlightsNumber() + " lotów");
//        } else {
//            System.out.println("Nie dolecisz");
//        }
//    }
//}