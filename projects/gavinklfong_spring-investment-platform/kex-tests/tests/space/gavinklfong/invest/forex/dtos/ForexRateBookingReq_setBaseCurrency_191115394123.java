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

public class ForexRateBookingReq_setBaseCurrency_191115394123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6577;

    public ForexRateBookingReq_setBaseCurrency_191115394123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6577 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq"));
        setField(term6577, term6577.getClass(), "baseCurrency", null);
        setField(term6577, term6577.getClass(), "counterCurrency", null);
        setField(term6577, term6577.getClass(), "baseCurrencyAmount", null);
        setField(term6577, term6577.getClass(), "tradeAction", null);
        setField(term6577, term6577.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBaseCurrency", argTypes, term6577, args);
    }

};


