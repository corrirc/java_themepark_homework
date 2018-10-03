import Rides.Customer;
import Rides.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class DodgemsTest {
        private Dodgems dodgems;
        private Customer customer;


        @Before
        public void before() {
            dodgems = new Dodgems(120, 4.00);
        }

        @Test
        public void canGetPrice() {
            assertEquals(4.00, dodgems.getPrice(), 0.01);
        }

        @Test
        public void canMinHeight() {
            assertEquals(120, dodgems.getHeight());
        }

    }
