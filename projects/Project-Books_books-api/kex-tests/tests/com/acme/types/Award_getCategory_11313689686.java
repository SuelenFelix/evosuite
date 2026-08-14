package com.acme.types;

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
import static com.acme.types.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Award_getCategory_11313689686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5574;

    public Award_getCategory_11313689686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5627 = Class.forName((String) "com.acme.types.AwardName");
        Field term5626 = ((Class) term5627).getDeclaredField((String) "WOMENS_PRIZE");
        ((Field) term5626).setAccessible(true);
        Object enum12 = ((Field) term5626).get((Object) null);
        term5574 = newInstance(Class.forName("com.acme.types.Award"));
        setField(term5574, term5574.getClass(), "id", "oOHlrJrFIp");
        setField(term5574, term5574.getClass(), "awardName", enum12);
        setField(term5574, term5574.getClass(), "category", "vqZvnioIVM");
        setIntField(term5574, term5574.getClass(), "year", 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.acme.types.Award");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term5574, args);
    }

};


