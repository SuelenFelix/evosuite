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
     Object term35133;
     Object term35160;

    public Office_setId_19405410223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35134 = new Integer(-1222006000);
        term35133 = newInstance(Class.forName("com.iwamih31.Office"));
        setField(term35133, term35133.getClass(), "id", term35134);
        setField(term35133, term35133.getClass(), "item_name", "IbUFkzIgzq");
        setField(term35133, term35133.getClass(), "item_value", "dTOUSTDdbw");
        term35160 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Office");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term35160;
        callMethod(klass, "setId", argTypes, term35133, args);
    }

};


