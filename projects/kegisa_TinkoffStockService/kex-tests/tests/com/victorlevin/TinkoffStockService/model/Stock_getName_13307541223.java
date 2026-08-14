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

public class Stock_getName_13307541223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5624;

    public Stock_getName_13307541223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5738 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term5737 = ((Class) term5738).getDeclaredField((String) "HKD");
        ((Field) term5737).setAccessible(true);
        Object enum14 = ((Field) term5737).get((Object) null);
        term5624 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term5624, term5624.getClass(), "ticker", "DyiXbeYIaN");
        setField(term5624, term5624.getClass(), "figi", "VGizxZnyHX");
        setField(term5624, term5624.getClass(), "name", "kVEZMHmRtR");
        setField(term5624, term5624.getClass(), "type", "ekxGuOYIwi");
        setField(term5624, term5624.getClass(), "currency", enum14);
        setField(term5624, term5624.getClass(), "source", "RbVQXSpxXy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5624, args);
    }

};


