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

public class Stock_getSource_2168315786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6791;

    public Stock_getSource_2168315786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6905 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term6904 = ((Class) term6905).getDeclaredField((String) "RUB");
        ((Field) term6904).setAccessible(true);
        Object enum17 = ((Field) term6904).get((Object) null);
        term6791 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term6791, term6791.getClass(), "ticker", "PgPzMSEjjX");
        setField(term6791, term6791.getClass(), "figi", "wzsPSPcRdj");
        setField(term6791, term6791.getClass(), "name", "kGMQdqJYyB");
        setField(term6791, term6791.getClass(), "type", "XJJNClzHRf");
        setField(term6791, term6791.getClass(), "currency", enum17);
        setField(term6791, term6791.getClass(), "source", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term6791, args);
    }

};


