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

public class ForexTradeDeal_ForexTradeDealBuilder_baseCurrencyAmount_71193268820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10726;

    public ForexTradeDeal_ForexTradeDealBuilder_baseCurrencyAmount_71193268820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10726 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        setField(term10726, term10726.getClass(), "id", null);
        setField(term10726, term10726.getClass(), "dealRef", null);
        setField(term10726, term10726.getClass(), "timestamp", null);
        setField(term10726, term10726.getClass(), "baseCurrency", null);
        setField(term10726, term10726.getClass(), "counterCurrency", null);
        setField(term10726, term10726.getClass(), "rate", null);
        setField(term10726, term10726.getClass(), "tradeAction", null);
        setField(term10726, term10726.getClass(), "baseCurrencyAmount", null);
        setField(term10726, term10726.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "baseCurrencyAmount", argTypes, term10726, args);
    }

};


