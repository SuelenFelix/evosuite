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

public class ForexTradeDeal_toString_6867677447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34472;

    public ForexTradeDeal_toString_6867677447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34472 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal"));
        setField(term34472, term34472.getClass(), "id", null);
        setField(term34472, term34472.getClass(), "dealRef", null);
        setField(term34472, term34472.getClass(), "timestamp", null);
        setField(term34472, term34472.getClass(), "baseCurrency", null);
        setField(term34472, term34472.getClass(), "counterCurrency", null);
        setField(term34472, term34472.getClass(), "rate", null);
        setField(term34472, term34472.getClass(), "tradeAction", null);
        setField(term34472, term34472.getClass(), "baseCurrencyAmount", null);
        setField(term34472, term34472.getClass(), "customerId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexTradeDeal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term34472, args);
    }

};


