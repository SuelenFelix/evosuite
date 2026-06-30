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
import java.lang.Object;
import java.lang.Double;

public class ForexRate_setBaseCurrency_19889319949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25346;

    public ForexRate_setBaseCurrency_19889319949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25374 = new Double(0.07417792024383196);
        Double term25376 = new Double(0.686293604788188);
        term25346 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25347 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25347, term25347.getClass(), "seconds", 1663413767L);
        setIntField(term25347, term25347.getClass(), "nanos", 651000000);
        setField(term25346, term25346.getClass(), "timestamp", term25347);
        setField(term25346, term25346.getClass(), "baseCurrency", "WxYUTuqmIq");
        setField(term25346, term25346.getClass(), "counterCurrency", "OeQLvhVERT");
        setField(term25346, term25346.getClass(), "buyRate", term25374);
        setField(term25346, term25346.getClass(), "sellRate", term25376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IlvgFINwIa";
        callMethod(klass, "setBaseCurrency", argTypes, term25346, args);
    }

};


