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

public class FsmContext_Key_hashCode_13500581787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238;

    public FsmContext_Key_hashCode_13500581787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4238 = newInstance(Class.forName("com.digitalpetri.fsm.FsmContext$Key"));
        setField(term4238, term4238.getClass(), "name", "cAPeiZHKGJ");
        setField(term4238, term4238.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.FsmContext$Key");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4238, args);
    }

};


