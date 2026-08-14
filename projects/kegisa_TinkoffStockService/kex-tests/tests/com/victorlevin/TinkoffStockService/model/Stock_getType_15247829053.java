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

public class Stock_getType_15247829053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1858;

    public Stock_getType_15247829053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1972 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term1971 = ((Class) term1972).getDeclaredField((String) "EUR");
        ((Field) term1971).setAccessible(true);
        Object enum5 = ((Field) term1971).get((Object) null);
        term1858 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1858, term1858.getClass(), "ticker", "tbcdzjIfER");
        setField(term1858, term1858.getClass(), "figi", "HyxfbSQYBe");
        setField(term1858, term1858.getClass(), "name", "pCTimMblYc");
        setField(term1858, term1858.getClass(), "type", "hNxWaHcfhY");
        setField(term1858, term1858.getClass(), "currency", enum5);
        setField(term1858, term1858.getClass(), "source", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1858, args);
    }

};


