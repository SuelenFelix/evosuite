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
import java.util.ArrayList;
import java.util.LinkedList;

public class TransitionBuilder_on_13357433631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;
     Object term1546;

    public TransitionBuilder_on_13357433631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1539 = new ArrayList();
        LinkedList term1543 = new LinkedList();
        term1538 = newInstance(Class.forName("com.digitalpetri.fsm.dsl.TransitionBuilder"));
        setField(term1538, term1538.getClass(), "from", null);
        setField(term1538, term1538.getClass(), "transitions", term1539);
        setField(term1538, term1538.getClass(), "transitionActions", term1543);
        term1546 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.digitalpetri.fsm.dsl.TransitionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1546;
        callMethod(klass, "on", argTypes, term1538, args);
    }

};


