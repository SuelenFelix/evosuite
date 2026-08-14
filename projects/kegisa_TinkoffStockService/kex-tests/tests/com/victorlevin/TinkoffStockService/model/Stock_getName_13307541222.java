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

public class Stock_getName_13307541222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1469;

    public Stock_getName_13307541222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1583 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term1582 = ((Class) term1583).getDeclaredField((String) "CNY");
        ((Field) term1582).setAccessible(true);
        Object enum4 = ((Field) term1582).get((Object) null);
        term1469 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1469, term1469.getClass(), "ticker", "MxlszYVzRf");
        setField(term1469, term1469.getClass(), "figi", "LQFpaHEwXR");
        setField(term1469, term1469.getClass(), "name", "oVcInYnLWB");
        setField(term1469, term1469.getClass(), "type", "aJlieCFVtF");
        setField(term1469, term1469.getClass(), "currency", enum4);
        setField(term1469, term1469.getClass(), "source", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1469, args);
    }

};


