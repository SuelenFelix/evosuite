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

public class StrictMachine_FsmContextImpl_currentState_80009792310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2535;

    public StrictMachine_FsmContextImpl_currentState_80009792310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2535 = newInstance(Class.forName("com.digitalpetri.fsm.StrictMachine$FsmContextImpl"));
        setField(term2535, term2535.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.StrictMachine$FsmContextImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "currentState", argTypes, term2535, args);
    }

};


