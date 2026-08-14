package com.digitalpetri.fsm.dsl;

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
import static com.digitalpetri.fsm.dsl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ActionFromBuilder_to_130637546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1512;

    public ActionFromBuilder_to_130637546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1512 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.ActionFromBuilder"));
        setField(term1512, term1512.getClass(), "fromFilter", null);
        setField(term1512, term1512.getClass(), "transitionActions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.ActionFromBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "to", argTypes, term1512, args);
    }

};


