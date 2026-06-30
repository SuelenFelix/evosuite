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

public class ForexRateBookingReq_ForexRateBookingReqBuilder_baseCurrency_9817750389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13403;

    public ForexRateBookingReq_ForexRateBookingReqBuilder_baseCurrency_9817750389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13403 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder"));
        setField(term13403, term13403.getClass(), "baseCurrency", null);
        setField(term13403, term13403.getClass(), "counterCurrency", null);
        setField(term13403, term13403.getClass(), "baseCurrencyAmount", null);
        setField(term13403, term13403.getClass(), "tradeAction", null);
        setField(term13403, term13403.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRateBookingReq$ForexRateBookingReqBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "baseCurrency", argTypes, term13403, args);
    }

};


