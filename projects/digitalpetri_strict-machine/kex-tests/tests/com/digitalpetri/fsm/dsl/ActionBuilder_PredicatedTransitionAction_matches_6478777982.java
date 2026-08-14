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

public class ActionBuilder_PredicatedTransitionAction_matches_6478777982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term49;
     Object term50;
     Object term51;

    public ActionBuilder_PredicatedTransitionAction_matches_6478777982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.ActionBuilder$PredicatedTransitionAction"));
        setField(term48, term48.getClass(), "from", null);
        setField(term48, term48.getClass(), "to", null);
        setField(term48, term48.getClass(), "via", null);
        setField(term48, term48.getClass(), "action", null);
        term49 = newInstance(Class.forName("java.lang.Object"));
        term50 = newInstance(Class.forName("java.lang.Object"));
        term51 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.ActionBuilder$PredicatedTransitionAction");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = term49;
        args[1] = term50;
        args[2] = term51;
        callMethod(klass, "matches", argTypes, term48, args);
    }

};


