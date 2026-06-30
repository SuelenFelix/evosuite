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

public class ForexTradeDeal_ForexTradeDealBuilder_build_45671309822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10728;

    public ForexTradeDeal_ForexTradeDealBuilder_build_45671309822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10728 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder"));
        setField(term10728, term10728.getClass(), "id", null);
        setField(term10728, term10728.getClass(), "dealRef", null);
        setField(term10728, term10728.getClass(), "timestamp", null);
        setField(term10728, term10728.getClass(), "baseCurrency", null);
        setField(term10728, term10728.getClass(), "counterCurrency", null);
        setField(term10728, term10728.getClass(), "rate", null);
        setField(term10728, term10728.getClass(), "tradeAction", null);
        setField(term10728, term10728.getClass(), "baseCurrencyAmount", null);
        setField(term10728, term10728.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal$ForexTradeDealBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term10728, args);
    }

};


