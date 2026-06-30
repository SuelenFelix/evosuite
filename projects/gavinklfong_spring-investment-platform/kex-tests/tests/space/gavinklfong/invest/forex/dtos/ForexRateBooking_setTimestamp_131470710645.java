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

public class ForexRateBooking_setTimestamp_131470710645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24915;

    public ForexRateBooking_setTimestamp_131470710645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24915 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        setField(term24915, term24915.getClass(), "id", null);
        setField(term24915, term24915.getClass(), "timestamp", null);
        setField(term24915, term24915.getClass(), "baseCurrency", null);
        setField(term24915, term24915.getClass(), "counterCurrency", null);
        setField(term24915, term24915.getClass(), "rate", null);
        setField(term24915, term24915.getClass(), "tradeAction", null);
        setField(term24915, term24915.getClass(), "baseCurrencyAmount", null);
        setField(term24915, term24915.getClass(), "bookingRef", null);
        setField(term24915, term24915.getClass(), "expiryTime", null);
        setField(term24915, term24915.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTimestamp", argTypes, term24915, args);
    }

};


