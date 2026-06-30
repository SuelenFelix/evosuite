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

public class ForexRateBooking_toString_13809729757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24927;

    public ForexRateBooking_toString_13809729757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24927 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking"));
        setField(term24927, term24927.getClass(), "id", null);
        setField(term24927, term24927.getClass(), "timestamp", null);
        setField(term24927, term24927.getClass(), "baseCurrency", null);
        setField(term24927, term24927.getClass(), "counterCurrency", null);
        setField(term24927, term24927.getClass(), "rate", null);
        setField(term24927, term24927.getClass(), "tradeAction", null);
        setField(term24927, term24927.getClass(), "baseCurrencyAmount", null);
        setField(term24927, term24927.getClass(), "bookingRef", null);
        setField(term24927, term24927.getClass(), "expiryTime", null);
        setField(term24927, term24927.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24927, args);
    }

};


