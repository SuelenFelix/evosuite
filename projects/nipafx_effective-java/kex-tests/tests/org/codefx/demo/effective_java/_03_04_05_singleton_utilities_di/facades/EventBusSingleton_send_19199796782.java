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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class EventBusSingleton_send_19199796782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6472;
     Object term6473;

    public EventBusSingleton_send_19199796782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6472 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusSingleton"));
        Class<? extends Object> term6507 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term6506 = ((Class) term6507).getDeclaredField((String) "ORDER");
        ((Field) term6506).setAccessible(true);
        Object enum15 =  ((Field) term6506).get((Object) null);
        Class<? extends Object> term6894 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term6893 = ((Class) term6894).getDeclaredField((String) "ORDER");
        ((Field) term6893).setAccessible(true);
        Object enum16 =  ((Field) term6893).get((Object) null);
        ArrayList term6486 = new ArrayList();
        ((ArrayList) term6486).add(enum15);
        ((ArrayList) term6486).add(enum15);
        ((ArrayList) term6486).add(enum16);
        ((ArrayList) term6486).add(enum16);
        ((ArrayList) term6486).add(enum15);
        ((ArrayList) term6486).add(enum15);
        ((ArrayList) term6486).add(enum15);
        term6473 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term6473, term6473.getClass(), "message", "SzjVpOQTyS");
        setField(term6473, term6473.getClass(), "tags", term6486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusSingleton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = term6473;
        callMethod(klass, "send", argTypes, term6472, args);
    }

};


