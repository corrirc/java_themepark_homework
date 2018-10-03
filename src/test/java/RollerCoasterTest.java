import Rides.Customer;
import Rides.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    private Rollercoaster rollercoaster;
    private Customer customer;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster(100, 5.00);
    }

    @Test
    public void canGetPrice() {
        assertEquals(5.00, rollercoaster.getPrice(), 0.01);
    }

    @Test
    public void canMinHeight() {
        assertEquals(100, rollercoaster.getHeight());
    }
}
