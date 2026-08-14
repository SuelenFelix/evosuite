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

public class Stock_getTicker_4078698330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;

    public Stock_getTicker_4078698330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term805 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term804 = ((Class) term805).getDeclaredField((String) "CNY");
        ((Field) term804).setAccessible(true);
        Object enum2 = ((Field) term804).get((Object) null);
        term691 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term691, term691.getClass(), "ticker", "MuLcgQHgqz");
        setField(term691, term691.getClass(), "figi", "xxtlPwDYFs");
        setField(term691, term691.getClass(), "name", "jJCZpVmanW");
        setField(term691, term691.getClass(), "type", "EGtDIRbSSb");
        setField(term691, term691.getClass(), "currency", enum2);
        setField(term691, term691.getClass(), "source", "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTicker", argTypes, term691, args);
    }

};


