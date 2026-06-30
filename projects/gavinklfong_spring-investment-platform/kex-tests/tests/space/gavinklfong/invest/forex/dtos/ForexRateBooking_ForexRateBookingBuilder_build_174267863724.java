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

public class ForexRateBooking_ForexRateBookingBuilder_build_174267863724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38936;

    public ForexRateBooking_ForexRateBookingBuilder_build_174267863724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38936 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        setField(term38936, term38936.getClass(), "id", null);
        setField(term38936, term38936.getClass(), "timestamp", null);
        setField(term38936, term38936.getClass(), "baseCurrency", null);
        setField(term38936, term38936.getClass(), "counterCurrency", null);
        setField(term38936, term38936.getClass(), "rate", null);
        setField(term38936, term38936.getClass(), "tradeAction", null);
        setField(term38936, term38936.getClass(), "baseCurrencyAmount", null);
        setField(term38936, term38936.getClass(), "bookingRef", null);
        setField(term38936, term38936.getClass(), "expiryTime", null);
        setField(term38936, term38936.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term38936, args);
    }

};


