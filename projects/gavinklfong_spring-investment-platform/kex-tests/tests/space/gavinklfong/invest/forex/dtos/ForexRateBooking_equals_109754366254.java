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

public class ForexRateBooking_equals_109754366254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24924;

    public ForexRateBooking_equals_109754366254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24924 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        setField(term24924, term24924.getClass(), "id", null);
        setField(term24924, term24924.getClass(), "timestamp", null);
        setField(term24924, term24924.getClass(), "baseCurrency", null);
        setField(term24924, term24924.getClass(), "counterCurrency", null);
        setField(term24924, term24924.getClass(), "rate", null);
        setField(term24924, term24924.getClass(), "tradeAction", null);
        setField(term24924, term24924.getClass(), "baseCurrencyAmount", null);
        setField(term24924, term24924.getClass(), "bookingRef", null);
        setField(term24924, term24924.getClass(), "expiryTime", null);
        setField(term24924, term24924.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term24924, args);
    }

};


