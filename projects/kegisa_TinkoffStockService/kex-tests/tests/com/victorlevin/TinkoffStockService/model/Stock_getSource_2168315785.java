package com.victorlevin.TinkoffStockService.model;

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
import static com.victorlevin.TinkoffStockService.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Stock_getSource_2168315785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2636;

    public Stock_getSource_2168315785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2750 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term2749 = ((Class) term2750).getDeclaredField((String) "HKD");
        ((Field) term2749).setAccessible(true);
        Object enum7 = ((Field) term2749).get((Object) null);
        term2636 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term2636, term2636.getClass(), "ticker", "OclPbYPkcH");
        setField(term2636, term2636.getClass(), "figi", "IoAlmYsBwc");
        setField(term2636, term2636.getClass(), "name", "TEParAifyi");
        setField(term2636, term2636.getClass(), "type", "OWDIEULEFu");
        setField(term2636, term2636.getClass(), "currency", enum7);
        setField(term2636, term2636.getClass(), "source", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term2636, args);
    }

};


