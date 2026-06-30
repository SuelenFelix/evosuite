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
import java.lang.Double;

public class ForexPriceReq_setBaseCurrency_15240305874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14827;

    public ForexPriceReq_setBaseCurrency_15240305874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term14852 = new Double(0.15917839663695388);
        term14827 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq"));
        setField(term14827, term14827.getClass(), "baseCurrency", "lFRJFUMVbx");
        setField(term14827, term14827.getClass(), "counterCurrency", "sZdUNdggUW");
        setField(term14827, term14827.getClass(), "rate", term14852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexPriceReq");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "setBaseCurrency", argTypes, term14827, args);
    }

};


