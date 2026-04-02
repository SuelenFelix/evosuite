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

public class PredicatedTransition_matches_6284444612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term33;
     Object term34;

    public PredicatedTransition_matches_6284444612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.PredicatedTransition"));
        setField(term32, term32.getClass(), "guard", null);
        setField(term32, term32.getClass(), "from", null);
        setField(term32, term32.getClass(), "via", null);
        setField(term32, term32.getClass(), "target", null);
        term33 = newInstance(Class.forName("java.lang.Object"));
        term34 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.PredicatedTransition");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.FsmContext");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term33;
        args[2] = term34;
        callMethod(klass, "matches", argTypes, term32, args);
    }

};


