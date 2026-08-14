package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class EventBusEnum_send_19961150983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;
     Object term35;

    public EventBusEnum_send_19961150983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusEnum");
        Field term73 = ((Class) term74).getDeclaredField((String) "INSTANCE");
        ((Field) term73).setAccessible(true);
        enum0 = ((Field) term73).get((Object) null);
        Class<? extends Object> term565 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term564 = ((Class) term565).getDeclaredField((String) "ORDER");
        ((Field) term564).setAccessible(true);
        Object enum1 =  ((Field) term564).get((Object) null);
        Class<? extends Object> term952 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term951 = ((Class) term952).getDeclaredField((String) "FINANCIAL");
        ((Field) term951).setAccessible(true);
        Object enum2 =  ((Field) term951).get((Object) null);
        Class<? extends Object> term1351 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term1350 = ((Class) term1351).getDeclaredField((String) "USER");
        ((Field) term1350).setAccessible(true);
        Object enum3 =  ((Field) term1350).get((Object) null);
        ArrayList term48 = new ArrayList();
        ((ArrayList) term48).add(enum1);
        ((ArrayList) term48).add(enum2);
        ((ArrayList) term48).add(enum1);
        ((ArrayList) term48).add(enum2);
        ((ArrayList) term48).add(enum3);
        term35 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term35, term35.getClass(), "message", "sjlJAEtRrb");
        setField(term35, term35.getClass(), "tags", term48);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusEnum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "send", argTypes, enum0, args);
    }

};


