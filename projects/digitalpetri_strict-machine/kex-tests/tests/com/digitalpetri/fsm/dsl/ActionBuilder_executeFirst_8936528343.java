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
import java.util.LinkedList;

public class ActionBuilder_executeFirst_8936528343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1525;

    public ActionBuilder_executeFirst_8936528343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1526 = new LinkedList();
        term1525 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.ActionBuilder"));
        setField(term1525, term1525.getClass(), "from", null);
        setField(term1525, term1525.getClass(), "to", null);
        setField(term1525, term1525.getClass(), "via", null);
        setField(term1525, term1525.getClass(), "transitionActions", term1526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.ActionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.digitalpetri.fsm.dsl.Action");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "executeFirst", argTypes, term1525, args);
    }

};


