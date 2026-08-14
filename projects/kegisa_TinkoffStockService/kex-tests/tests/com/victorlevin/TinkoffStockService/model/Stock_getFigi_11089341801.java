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

public class Stock_getFigi_11089341801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public Stock_getFigi_11089341801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1194 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term1193 = ((Class) term1194).getDeclaredField((String) "TRY");
        ((Field) term1193).setAccessible(true);
        Object enum3 = ((Field) term1193).get((Object) null);
        term1080 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term1080, term1080.getClass(), "ticker", "MjGYSRKTNF");
        setField(term1080, term1080.getClass(), "figi", "hRNSzYYIrc");
        setField(term1080, term1080.getClass(), "name", "RMFIsYGgne");
        setField(term1080, term1080.getClass(), "type", "NRdvgJlhkX");
        setField(term1080, term1080.getClass(), "currency", enum3);
        setField(term1080, term1080.getClass(), "source", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFigi", argTypes, term1080, args);
    }

};


