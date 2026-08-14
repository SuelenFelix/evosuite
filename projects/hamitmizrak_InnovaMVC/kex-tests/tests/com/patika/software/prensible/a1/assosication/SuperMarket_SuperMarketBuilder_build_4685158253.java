package com.patika.software.prensible.a1.assosication;

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
import static com.patika.software.prensible.a1.assosication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SuperMarket_SuperMarketBuilder_build_4685158253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public SuperMarket_SuperMarketBuilder_build_4685158253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.patika.software.prensible.a1.assosication.SuperMarket$SuperMarketBuilder"));
        setField(term135, term135.getClass(), "superMarketAdi", "SzjVpOQTyS");
        setField(term135, term135.getClass(), "superMarketSehir", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.software.prensible.a1.assosication.SuperMarket$SuperMarketBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term135, args);
    }

};


