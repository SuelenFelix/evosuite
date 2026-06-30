package space.gavinklfong.invest.forex.dtos;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ForexRateBooking_ForexRateBookingBuilder_expiryTime_12940280522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38934;

    public ForexRateBooking_ForexRateBookingBuilder_expiryTime_12940280522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38934 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        setField(term38934, term38934.getClass(), "id", null);
        setField(term38934, term38934.getClass(), "timestamp", null);
        setField(term38934, term38934.getClass(), "baseCurrency", null);
        setField(term38934, term38934.getClass(), "counterCurrency", null);
        setField(term38934, term38934.getClass(), "rate", null);
        setField(term38934, term38934.getClass(), "tradeAction", null);
        setField(term38934, term38934.getClass(), "baseCurrencyAmount", null);
        setField(term38934, term38934.getClass(), "bookingRef", null);
        setField(term38934, term38934.getClass(), "expiryTime", null);
        setField(term38934, term38934.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "expiryTime", argTypes, term38934, args);
    }

};


