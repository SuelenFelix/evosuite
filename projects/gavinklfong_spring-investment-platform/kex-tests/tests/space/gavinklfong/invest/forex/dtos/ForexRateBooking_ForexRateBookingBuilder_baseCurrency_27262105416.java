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

public class ForexRateBooking_ForexRateBookingBuilder_baseCurrency_27262105416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38928;

    public ForexRateBooking_ForexRateBookingBuilder_baseCurrency_27262105416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38928 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder"));
        setField(term38928, term38928.getClass(), "id", null);
        setField(term38928, term38928.getClass(), "timestamp", null);
        setField(term38928, term38928.getClass(), "baseCurrency", null);
        setField(term38928, term38928.getClass(), "counterCurrency", null);
        setField(term38928, term38928.getClass(), "rate", null);
        setField(term38928, term38928.getClass(), "tradeAction", null);
        setField(term38928, term38928.getClass(), "baseCurrencyAmount", null);
        setField(term38928, term38928.getClass(), "bookingRef", null);
        setField(term38928, term38928.getClass(), "expiryTime", null);
        setField(term38928, term38928.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBooking$ForexRateBookingBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "baseCurrency", argTypes, term38928, args);
    }

};


