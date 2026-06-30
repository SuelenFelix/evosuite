package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Office_equals_16277161216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39832;
     Object term39859;

    public Office_equals_16277161216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39833 = new Integer(-2119545015);
        term39832 = newInstance(Class.forName("com.iwamih31.Office"));
        setField(term39832, term39832.getClass(), "id", term39833);
        setField(term39832, term39832.getClass(), "item_name", "ZrchvNGMtd");
        setField(term39832, term39832.getClass(), "item_value", "WaEcyVlcIx");
        term39859 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Office");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term39859;
        callMethod(klass, "equals", argTypes, term39832, args);
    }

};


