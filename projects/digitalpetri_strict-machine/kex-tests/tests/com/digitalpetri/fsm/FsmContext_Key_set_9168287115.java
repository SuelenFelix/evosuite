package com.digitalpetri.fsm;

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
import static com.digitalpetri.fsm.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FsmContext_Key_set_9168287115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4190;
     Object term4203;

    public FsmContext_Key_set_9168287115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4190 = newInstance(Class.forName("com.digitalpetri.fsm.FsmContext$Key"));
        setField(term4190, term4190.getClass(), "name", "jUbSRrkrYZ");
        setField(term4190, term4190.getClass(), "type", null);
        term4203 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.FsmContext$Key");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.FsmContext");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4203;
        callMethod(klass, "set", argTypes, term4190, args);
    }

};


