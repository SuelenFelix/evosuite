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

public class Stock_init_20450621939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum11;

    public Stock_init_20450621939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4306 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term4305 = ((Class) term4306).getDeclaredField((String) "GBP");
        ((Field) term4305).setAccessible(true);
        enum11 = ((Field) term4305).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.victorlevin.TinkoffStockService.model.Currency");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = "LvtrsXUliU";
        args[1] = "xLbjWUgOIL";
        args[2] = "jDtqGUpnZN";
        args[3] = "nGKItKLYNC";
        args[4] = enum11;
        args[5] = "UiUYnPrcCi";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


