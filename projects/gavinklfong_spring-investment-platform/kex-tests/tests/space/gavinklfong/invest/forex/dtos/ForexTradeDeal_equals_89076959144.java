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

public class ForexTradeDeal_equals_89076959144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34469;

    public ForexTradeDeal_equals_89076959144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34469 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        setField(term34469, term34469.getClass(), "id", null);
        setField(term34469, term34469.getClass(), "dealRef", null);
        setField(term34469, term34469.getClass(), "timestamp", null);
        setField(term34469, term34469.getClass(), "baseCurrency", null);
        setField(term34469, term34469.getClass(), "counterCurrency", null);
        setField(term34469, term34469.getClass(), "rate", null);
        setField(term34469, term34469.getClass(), "tradeAction", null);
        setField(term34469, term34469.getClass(), "baseCurrencyAmount", null);
        setField(term34469, term34469.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term34469, args);
    }

};


