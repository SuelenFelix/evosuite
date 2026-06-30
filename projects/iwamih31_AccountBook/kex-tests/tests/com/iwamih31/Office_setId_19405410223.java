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

public class Office_setId_19405410223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39645;
     Object term39672;

    public Office_setId_19405410223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39646 = new Integer(877649659);
        term39645 = newInstance(Class.forName("com.iwamih31.Office"));
        setField(term39645, term39645.getClass(), "id", term39646);
        setField(term39645, term39645.getClass(), "item_name", "UqKUbMyPMJ");
        setField(term39645, term39645.getClass(), "item_value", "QpYltHAdyY");
        term39672 = new Integer(-1332748804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Office");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term39672;
        callMethod(klass, "setId", argTypes, term39645, args);
    }

};


