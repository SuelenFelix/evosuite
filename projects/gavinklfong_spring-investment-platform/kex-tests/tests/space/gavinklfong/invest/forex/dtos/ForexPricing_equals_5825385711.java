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
import java.lang.Integer;

public class ForexPricing_equals_5825385711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083;
     Object term1112;

    public ForexPricing_equals_5825385711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1108 = new Integer(-2068769794);
        Integer term1110 = new Integer(-117576464);
        term1083 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing"));
        setField(term1083, term1083.getClass(), "baseCurrency", "eZFUvlxvGV");
        setField(term1083, term1083.getClass(), "counterCurrency", "BYqFIqCKAV");
        setField(term1083, term1083.getClass(), "buyPip", term1108);
        setField(term1083, term1083.getClass(), "sellPip", term1110);
        term1112 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPricing");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1112;
        callMethod(klass, "equals", argTypes, term1083, args);
    }

};


