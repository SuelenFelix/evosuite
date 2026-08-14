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

public class Stock_getFigi_11089341802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5235;

    public Stock_getFigi_11089341802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5349 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term5348 = ((Class) term5349).getDeclaredField((String) "HKD");
        ((Field) term5348).setAccessible(true);
        Object enum13 = ((Field) term5348).get((Object) null);
        term5235 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term5235, term5235.getClass(), "ticker", "cudZvLMQon");
        setField(term5235, term5235.getClass(), "figi", "lihXWlGDxk");
        setField(term5235, term5235.getClass(), "name", "JmcmxoGhIK");
        setField(term5235, term5235.getClass(), "type", "jXzmYyrnnT");
        setField(term5235, term5235.getClass(), "currency", enum13);
        setField(term5235, term5235.getClass(), "source", "igCAtimmYB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFigi", argTypes, term5235, args);
    }

};


