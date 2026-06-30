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

public class ForexRateBookingReq_builder_69471839417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6571;

    public ForexRateBookingReq_builder_69471839417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6571 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        setField(term6571, term6571.getClass(), "baseCurrency", null);
        setField(term6571, term6571.getClass(), "counterCurrency", null);
        setField(term6571, term6571.getClass(), "baseCurrencyAmount", null);
        setField(term6571, term6571.getClass(), "tradeAction", null);
        setField(term6571, term6571.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term6571, args);
    }

};


