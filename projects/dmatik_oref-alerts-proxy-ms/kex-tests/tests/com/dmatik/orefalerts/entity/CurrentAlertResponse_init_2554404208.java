package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class CurrentAlertResponse_init_2554404208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1675;
     Object term1677;

    public CurrentAlertResponse_init_2554404208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1675 = new Boolean(true);
        term1677 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term1714 = (Object[]) newArray("java.lang.String", 1);
        setField(term1677, term1677.getClass(), "id", "HqBOwkVqjD");
        setField(term1677, term1677.getClass(), "cat", "MAcUBcBckh");
        setField(term1677, term1677.getClass(), "title", "oVgzLbrsFr");
        setElement(term1714, 0, "vQVyKLdtaz");
        setField(term1677, term1677.getClass(), "data", term1714);
        setField(term1677, term1677.getClass(), "desc", "OWKQODBLzb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Boolean");
        argTypes[1] = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Object[] args = new Object[2];
        args[0] = term1675;
        args[1] = term1677;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


