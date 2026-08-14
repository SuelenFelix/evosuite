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

public class StrictMachine_FsmContextImpl_set_15024610477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2509;
     Object term2510;
     Object term2523;

    public StrictMachine_FsmContextImpl_set_15024610477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2509 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine$FsmContextImpl"));
        setField(term2509, term2509.getClass(), "this$0", null);
        term2510 = newInstance(Class.forName("com.digitalpetri.fsm.FsmContext$Key"));
        setField(term2510, term2510.getClass(), "name", "dEnhdmILtU");
        setField(term2510, term2510.getClass(), "type", null);
        term2523 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$FsmContextImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.FsmContext$Key");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term2510;
        args[1] = term2523;
        callMethod(klass, "set", argTypes, term2509, args);
    }

};


