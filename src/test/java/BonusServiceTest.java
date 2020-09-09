import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredInRangeLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredZero() {
        BonusService service1 = new BonusService();

        long amount = 0;
        boolean registered = true;
        long expected = 0;

        long actual = service1.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredOverLimit() {
        BonusService service2 = new BonusService();

        long amount = 60000_00;
        boolean registered = false;
        long expected = 500;

        long actual = service2.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredInRangeLimit() {
        BonusService service3 = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service3.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredZero() {
        BonusService service4 = new BonusService();

        long amount = 0;
        boolean registered = false;
        long expected = 0;

        long actual = service4.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredOverLimit() {
        BonusService service5 = new BonusService();

        long amount = 20000_00;
        boolean registered = true;
        long expected = 500;

        long actual = service5.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}