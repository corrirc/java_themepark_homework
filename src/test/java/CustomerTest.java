import Ride.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
//    Rollercoaster rollercoaster;


    @Before
    public void before() {
        customer = new Customer(18, 190, 60.00);
    }

    @Test
    public void canGetAge() {
        assertEquals(18, customer.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(190, customer.getHeight());
    }

    @Test
    public void canGetWalletAmount() {
        assertEquals(60.00, customer.getWalletAmount());
    }
}
