import com.simon.domain.Customer;
import com.simon.domain.Movie;
import com.simon.domain.Rental;

public class Main {

    public static void main(String[] args) {
        Movie movie = new Movie("朝五晚九", 2);
        Customer customer = new Customer("张三");

        customer.addRental(new Rental(movie, 5));
        customer.addRental(new Rental(movie, 3));

        System.out.println(customer.statement());

    }
}
